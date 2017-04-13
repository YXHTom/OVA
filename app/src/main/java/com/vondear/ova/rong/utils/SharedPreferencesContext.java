package com.vondear.ova.rong.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


/**
 * Created by Bob on 2015/1/30.
 */
public class SharedPreferencesContext {

    private static SharedPreferencesContext mSharedPreferencesContext;
    public Context mContext;
    private SharedPreferences mPreferences;

    private SharedPreferencesContext() {

    }

    private SharedPreferencesContext(Context context) {
        mContext = context;
        mSharedPreferencesContext = this;

        mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void init(Context context) {
        mSharedPreferencesContext = new SharedPreferencesContext(context);
    }

    public static SharedPreferencesContext getInstance() {

        if (mSharedPreferencesContext == null) {
            mSharedPreferencesContext = new SharedPreferencesContext();
        }
        return mSharedPreferencesContext;
    }

    public SharedPreferences getSharedPreferences() {
        return mPreferences;
    }

}
