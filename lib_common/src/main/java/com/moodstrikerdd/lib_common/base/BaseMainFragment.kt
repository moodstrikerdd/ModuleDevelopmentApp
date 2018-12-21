package com.moodstrikerdd.lib_common.base

import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate

/**
 * @author moodstrikerdd
 * @date 2018/7/31
 * @label BaseFragment
 */
abstract class BaseMainFragment : BaseFragment() {
    init {
        val tabInfo = MainFragmentDelegate.TabInfo(null, null)
        setTabInfo(tabInfo)
        MainFragmentDelegate.add(getIndex(), this, tabInfo)
    }

    abstract fun setTabInfo(tabInfo: MainFragmentDelegate.TabInfo)

    abstract fun getIndex(): Int

}