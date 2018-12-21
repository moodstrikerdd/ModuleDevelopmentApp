package com.moodstrikerdd.moduledevelopmentapp

import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate
import com.moodstrikerdd.module1.Module1Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId() = R.layout.activity_main

    override fun initView() {
        MainFragmentDelegate.init()
        MainFragmentDelegate.bind(supportFragmentManager, rgMenu, R.id.flContain)
    }

    override fun initData() {
    }


}
