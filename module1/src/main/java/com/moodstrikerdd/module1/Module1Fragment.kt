package com.moodstrikerdd.module1

import com.moodstrikerdd.lib_common.base.BaseMainFragment
import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate

class Module1Fragment : BaseMainFragment() {
    override fun setTabInfo(tabInfo: MainFragmentDelegate.TabInfo) {
        tabInfo.name = "首页"
        tabInfo.resId = R.drawable.module1_menu
    }

    override fun getIndex() = 0

    override fun getLayoutId() = R.layout.module1_fragment_modle1

    override fun initView() {
    }

    override fun initData() {
    }
}