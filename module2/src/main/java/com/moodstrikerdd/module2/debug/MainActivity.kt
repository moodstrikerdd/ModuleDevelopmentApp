package com.moodstrikerdd.module2.debug

import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.module2.Module2Fragment
import com.moodstrikerdd.module2.R

class MainActivity : BaseActivity() {
    override fun getLayoutId() = R.layout.module2_activity_main

    override fun initData() {
    }

    override fun initView() {
        supportFragmentManager.beginTransaction()
                .add(R.id.flContain, Module2Fragment(), Module2Fragment::javaClass.name)
                .commit()
    }


}
