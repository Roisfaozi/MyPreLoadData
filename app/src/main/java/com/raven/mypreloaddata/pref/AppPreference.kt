package com.raven.mypreloaddata.pref

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class AppPreference (context: Context){
    companion object{
        private const val PREFS_NAME = "MahasiswaPref"
        private const val APP_FRIST_RUN = "app_frist_run"
    }

    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    var firstRun: Boolean?
        get() = prefs.getBoolean(APP_FRIST_RUN, true)
        set(input) {
            prefs.edit {
                putBoolean(APP_FRIST_RUN, input as Boolean)
            }
        }
}