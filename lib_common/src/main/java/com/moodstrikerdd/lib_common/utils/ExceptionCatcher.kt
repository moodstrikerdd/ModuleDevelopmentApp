package com.moodstrikerdd.lib_common.utils

import android.util.Log

object ExceptionCatcher : Thread.UncaughtExceptionHandler {
    private val TAG = "ExceptionCatcher"

    override fun uncaughtException(thread: Thread, throwable: Throwable) {
        Log.e(TAG, thread.name)
        throwable.printStackTrace()
    }
}