package com.bzcode.appskeletonv14.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.bzcode.appskeletonv14.common.Config;

public class SharedPrefHelper {

    private static SharedPrefHelper instance;
    private static final String SP_LOGIN_USERNAME = "username";
    private static Context mContext;

    private SharedPrefHelper(Context context) {
        this.mContext = context;
    }

    public static SharedPrefHelper getInstance(Context context) {
        if (instance == null) {
            instance = new SharedPrefHelper(context);
        }
        return instance;
    }

    public void saveUserName(String username) {
        try {

            SharedPreferences sharedPreferences = mContext.getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(SP_LOGIN_USERNAME, username);
            editor.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        try {

            SharedPreferences sharedPreferences = mContext.getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
            String apiKey = sharedPreferences.getString(SP_LOGIN_USERNAME, "");
            return apiKey;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
