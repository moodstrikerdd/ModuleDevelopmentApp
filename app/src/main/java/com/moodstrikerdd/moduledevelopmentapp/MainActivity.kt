package com.moodstrikerdd.moduledevelopmentapp

import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.lib_common.utils.MainFragmentDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId() = R.layout.activity_main

    override fun initView() {
        MainFragmentDelegate.init()
        MainFragmentDelegate.bind(supportFragmentManager, rgMenu, R.id.flContain)
    }

    override fun initData() {
    }


    override fun onDestroy() {
        super.onDestroy()
        ModuleActivityJumpReceiver.destory(this)
    }
}
