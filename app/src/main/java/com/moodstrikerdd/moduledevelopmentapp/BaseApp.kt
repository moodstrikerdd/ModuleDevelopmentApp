package com.moodstrikerdd.moduledevelopmentapp

import android.app.Application
import com.moodstrikerdd.lib_common.utils.ExceptionCatcher
import kotlin.properties.Delegates

/**
 * @author moodstrikerdd
 * @date 2018/3/20
 * @lable BaseApp
 */

class BaseApp : Application() {
    companion object {
        var instance: BaseApp by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        Thread.setDefaultUncaughtExceptionHandler(ExceptionCatcher)
        ModuleActivityJumpReceiver().init(this)
    }
}
