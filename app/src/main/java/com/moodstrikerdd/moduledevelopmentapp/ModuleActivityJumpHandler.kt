package com.moodstrikerdd.moduledevelopmentapp

import android.content.Intent
import com.moodstrikerdd.lib_common.constants.JumpActions
import com.moodstrikerdd.lib_common.utils.ActivityTaskManager
import com.moodstrikerdd.lib_common.utils.ModuleActivityJumpHelper

object ModuleActivityJumpHandler {

    fun handle(jumpInfo: ModuleActivityJumpHelper.JumpInfo) {
        when (jumpInfo.action) {
            JumpActions.JUMP_ACTION_TO_MODULE1ACTIVITY
                , JumpActions.JUMP_ACTION_TO_MODULE2ACTIVITY -> {
                val topActivity = ActivityTaskManager
                        .getTopActivity()
                topActivity.startActivity(Intent(topActivity, Class.forName(jumpInfo.action)))
            }
        }
    }
}