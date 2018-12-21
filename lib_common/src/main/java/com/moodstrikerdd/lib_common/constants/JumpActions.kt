package com.moodstrikerdd.lib_common.constants

object JumpActions {
    const val JUMP_ACTION_TO_MODULE1ACTIVITY = "com.moodstrikerdd.module1.Module1Activity"
    const val JUMP_ACTION_TO_MODULE2ACTIVITY = "com.moodstrikerdd.module2.Module2Activity"

    fun getJumpActions(): ArrayList<String> {
        val actions = arrayListOf<String>()
        val jumpActionsClass = this.javaClass
        val fields = jumpActionsClass.fields
        fields.forEach {
            val value = it.get(JumpActions)
            if (value is String) {
                actions.add(value)
            }
        }
        return actions
    }
}