package com.github.igrmk.smsq.helpers

import android.content.Context
import android.content.SharedPreferences
import com.github.igrmk.smsq.Constants

val Context.myPreferences: SharedPreferences
    get() = applicationContext.getSharedPreferences(Constants.PREFERENCES, Context.MODE_PRIVATE)

var SharedPreferences.key: String?
    get() = getString(Constants.PREF_KEY, null)
    set(value) = with(edit()) {
        putString(Constants.PREF_KEY, value)
        apply()
    }

var SharedPreferences.domainName: String
    get() = getString(Constants.PREF_DOMAIN_NAME, Constants.DEFAULT_DOMAIN_NAME)!!
    set(value) = with(edit()) {
        putString(Constants.PREF_DOMAIN_NAME, value)
        apply()
    }

var SharedPreferences.on: Boolean
    get() = getBoolean(Constants.PREF_ON, false)
    set(value) = with(edit()) {
        putBoolean(Constants.PREF_ON, value)
        apply()
    }

var SharedPreferences.showCarrier: Boolean
    get() = getBoolean(Constants.PREF_CARRIER, false)
    set(value) = with(edit()) {
        putBoolean(Constants.PREF_CARRIER, value)
        apply()
    }

var SharedPreferences.consent: Boolean
    get() = getBoolean(Constants.PREF_CONSENT, false)
    set(value) = with(edit()) {
        putBoolean(Constants.PREF_CONSENT, value)
        apply()
    }
