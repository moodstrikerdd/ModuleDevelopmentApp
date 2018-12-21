package com.moodstrikerdd.lib_common.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.widget.RadioButton
import android.widget.RadioGroup
import com.moodstrikerdd.lib_common.R

object MainFragmentDelegate {
    val classPath = arrayOf(
            "com.moodstrikerdd.module1.Module1Fragment",
            "com.moodstrikerdd.module2.Module2Fragment",
            "com.moodstrikerdd.module3.Module3Fragment")

    fun init() {
        classPath.forEach {
            val forName = Class.forName(it)
            val newInstance1 = forName.getConstructor().newInstance() as Fragment
//            fragments.add(newInstance1)
        }
    }

    val fragments = arrayListOf<Fragment>()
    val tabInfos = arrayListOf<TabInfo>()

    fun add(fragment: Fragment, tabInfo: TabInfo) {
        add(fragments.size, fragment, tabInfo)
    }

    fun add(index: Int, fragment: Fragment, tabInfo: TabInfo) {
        var indexTemp = index
        if(index >= fragments.size){
            indexTemp = fragments.size
        }
        fragments.add(indexTemp, fragment)
        tabInfos.add(indexTemp, tabInfo)
    }


    data class TabInfo(var name: String?,
                       var resId: Int?)

    fun bind(fragmentManager: FragmentManager, radioGroup: RadioGroup, containId: Int) {
        initRadioGroup(radioGroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            for (i in 0 until radioGroup.childCount) {
                val beginTransaction = fragmentManager.beginTransaction()
                val fragment = fragments[i]
                if (radioGroup.getChildAt(i).id == checkedId) {
                    if (fragment.isAdded) {
                        if (fragment.isHidden) {
                            beginTransaction.show(fragment).commit()
                        }
                    } else {
                        beginTransaction.add(containId, fragment, fragment.javaClass.simpleName).commit()
                    }
                } else {
                    if (fragment.isAdded) {
                        beginTransaction.hide(fragment).commit()
                    }
                }
            }
        }
        (radioGroup.getChildAt(0) as RadioButton).isChecked = true
    }

    private fun initRadioGroup(radioGroup: RadioGroup) {
        var widthPixels = radioGroup.context.resources.displayMetrics.widthPixels
        tabInfos.forEach {
            val radioButton = LayoutInflater.from(radioGroup.context).inflate(R.layout.radiobutton, null) as RadioButton
            val layoutParams = RadioGroup.LayoutParams(widthPixels / tabInfos.size, RadioGroup.LayoutParams.WRAP_CONTENT)
            radioButton.layoutParams = layoutParams
            val drawable = ContextCompat.getDrawable(radioButton.context, it.resId!!)
            drawable?.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
            radioButton.setCompoundDrawables(null, drawable, null, null)
            radioButton.text = it.name
            radioGroup.addView(radioButton)
        }
    }
}