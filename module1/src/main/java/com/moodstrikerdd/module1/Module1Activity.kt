package com.moodstrikerdd.module1

import android.os.Bundle
import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.lib_common.constants.JumpActions
import com.moodstrikerdd.lib_common.utils.ModuleActivityJumpHelper
import kotlinx.android.synthetic.main.module1_activity_mudule1.*

class Module1Activity : BaseActivity() {
    override fun getLayoutId() = R.layout.module1_activity_mudule1

    override fun initData() {
    }

    override fun initView() {
        message.text = "Module1的Activity"
        button.text = "跳转Module2的Activity"
        button.setOnClickListener {
            ModuleActivityJumpHelper.jump(this,JumpActions.JUMP_ACTION_TO_MODULE2ACTIVITY)
            finish()
        }
    }
}
