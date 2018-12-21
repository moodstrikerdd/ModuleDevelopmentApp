package com.moodstrikerdd.lib_common.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moodstrikerdd.lib_common.adapter.ViewHolder

/**
 * @author moodstrikerdd
 * @date 2018/7/31
 * @label BaseFragment
 */
abstract class BaseFragment : Fragment() {
    lateinit var contentView: View
    lateinit var viewHolder: ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val arguments = arguments
        if (arguments != null) {
            initBundleData(arguments)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
        initData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewHolder = ViewHolder.get(activity, getLayoutId(), container, false)
        contentView = viewHolder.convertView
        return contentView
    }

    abstract fun getLayoutId(): Int

    open fun initBundleData(arguments: Bundle) {

    }

    abstract fun initView()

    abstract fun initData()

}