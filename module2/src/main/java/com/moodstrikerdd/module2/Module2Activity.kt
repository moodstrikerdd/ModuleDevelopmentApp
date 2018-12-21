package com.moodstrikerdd.module2

import com.moodstrikerdd.lib_common.base.BaseActivity
import com.moodstrikerdd.lib_common.constants.JumpActions
import com.moodstrikerdd.lib_common.utils.ModuleActivityJumpHelper
import kotlinx.android.synthetic.main.module2_activity_module2.*

class Module2Activity : BaseActivity() {
    override fun getLayoutId() = R.layout.module2_activity_module2

    override fun initData() {
    }

    override fun initView() {
        message.text = "Module2的Activity"
        button.text = "跳转Module1的Activity"
        button.setOnClickListener {
            ModuleActivityJumpHelper.jump(this,JumpActions.JUMP_ACTION_TO_MODULE1ACTIVITY)
            finish()
        }
    }
}
