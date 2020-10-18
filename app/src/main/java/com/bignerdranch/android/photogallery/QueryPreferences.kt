package com.bignerdranch.android.photogallery

import android.content.Context
import android.preference.PreferenceManager
import androidx.core.content.edit

private const val PREF_SEARCH_QUERY = "searchQuery"
private const val PREF_LAST_RESULT_ID = "lastResultId"

//static across the program ("object")
object QueryPreferences {

    fun getStoredQuery(context: Context): String {
        val prefs =
            PreferenceManager.getDefaultSharedPreferences(context)

        //check if anything stored in SharedPreferences, else default is
        // empty string (second parameter)
        //non-null assertion operator ("!!") used at the end
        return prefs.getString(PREF_SEARCH_QUERY, "")!!
    }

    fun setStoredQuery(context: Context, query: String){
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString(PREF_SEARCH_QUERY, query)
            .apply()
    }

    fun getLastResultId(context: Context): String {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(PREF_LAST_RESULT_ID, "")!! //non-null assertion
                // operator, because it should never be null
    }

    fun setLastResultId(context: Context, lastResultId: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString(PREF_LAST_RESULT_ID, lastResultId)
            .apply()
    }
}