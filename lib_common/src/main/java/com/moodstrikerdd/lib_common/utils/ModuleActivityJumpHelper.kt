package com.moodstrikerdd.lib_common.utils

import android.content.Context
import android.content.Intent
import android.support.v4.content.LocalBroadcastManager
import com.moodstrikerdd.lib_common.constants.Params

object ModuleActivityJumpHelper {

    fun jump(context: Context, action: String, parmas: String? = null) {
        jump(context, JumpInfo(action, parmas))
    }

    fun jump(context: Context, jumpInfo: JumpInfo) {
        val instance = LocalBroadcastManager.getInstance(context)
        val intent = Intent(jumpInfo.action)
        intent.putExtra(Params.JUMP_DATA, jumpInfo.parmas)
        instance.sendBroadcast(intent)
    }

    data class JumpInfo(var action: String,
                        var parmas: String? = null)
}