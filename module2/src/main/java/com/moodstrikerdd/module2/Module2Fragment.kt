package com.moodstrikerdd.module2

import android.content.Intent
import com.moodstrikerdd.lib_common.base.BaseMainFragment
import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate
import kotlinx.android.synthetic.main.module2_fragment_modle2.*

class Module2Fragment : BaseMainFragment() {

    override fun setTabInfo(tabInfo: MainFragmentDelegate.TabInfo) {
        tabInfo.name = "发现"
        tabInfo.resId = R.drawable.module2_menu
    }

    override fun getIndex() = 1

    override fun getLayoutId() = R.layout.module2_fragment_modle2

    override fun initView() {
        button.setOnClickListener {
            startActivity(Intent(activity, Module2Activity::class.java))
        }
    }

    override fun initData() {
    }
}
