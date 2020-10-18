package com.bignerdranch.android.photogallery

import android.content.Context
import android.preference.PreferenceManager

private const val PREF_SEARCH_QUERY = "searchQuery"

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
}