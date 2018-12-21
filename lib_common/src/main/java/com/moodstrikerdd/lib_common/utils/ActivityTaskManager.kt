package com.moodstrikerdd.lib_common.utils

import android.app.Activity
import java.util.*

object ActivityTaskManager {
    val activities = LinkedList<Activity>()

    fun add(activity: Activity) {
        activities.add(activity)
    }

    fun remove(activity: Activity) {
        activities.remove(activity)
    }

    fun getTopActivity() = activities.last
}