package com.moodstrikerdd.module3

import com.moodstrikerdd.lib_common.base.BaseMainFragment
import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate

class Module3Fragment : BaseMainFragment() {
    override fun setTabInfo(tabInfo: MainFragmentDelegate.TabInfo) {
        tabInfo.name = "我的"
        tabInfo.resId = R.drawable.module3_menu
    }

    override fun getIndex() = 2

    override fun getLayoutId() = R.layout.module3_fragment_modle3

    override fun initView() {
    }

    override fun initData() {
    }
}