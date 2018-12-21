package com.moodstrikerdd.module3.debug

import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.module3.Module3Fragment
import com.moodstrikerdd.module3.R

class MainActivity : BaseActivity() {
    override fun getLayoutId() = R.layout.module3_activity_main

    override fun initData() {
    }

    override fun initView() {
        supportFragmentManager.beginTransaction()
                .add(R.id.flContain, Module3Fragment(), Module3Fragment::javaClass.name)
                .commit()
    }

}
