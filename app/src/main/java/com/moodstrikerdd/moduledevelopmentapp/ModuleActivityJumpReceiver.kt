package com.moodstrikerdd.moduledevelopmentapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v4.content.LocalBroadcastManager
import com.moodstrikerdd.lib_common.constants.JumpActions
import com.moodstrikerdd.lib_common.constants.Params
import com.moodstrikerdd.lib_common.utils.ModuleActivityJumpHelper

class ModuleActivityJumpReceiver : BroadcastReceiver() {
    fun init(context: Context) {
        val intentFilter = IntentFilter()
        JumpActions
                .getJumpActions()
                .forEach {
                    intentFilter.addAction(it)
                }
        LocalBroadcastManager
                .getInstance(context)
                .registerReceiver(this, intentFilter)

    }

    override fun onReceive(context: Context?, intent: Intent) {
        if (intent.action != null) {
            val jumpInfo = ModuleActivityJumpHelper
                    .JumpInfo(intent.action!!, intent.getStringExtra(Params.JUMP_DATA))
            ModuleActivityJumpHandler.handle(jumpInfo)
        }

    }
}