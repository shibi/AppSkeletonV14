package com.bzcode.appskeletonv14;

import android.app.Application;

import com.bzcode.appskeletonv14.utils.SharedPrefHelper;

public class CoreApp extends Application {

    //shared preference helper declaration
    private SharedPrefHelper prefHelper;

    @Override
    public void onCreate() {
        super.onCreate();

        //shared preference
        prefHelper = SharedPrefHelper.getInstance(this);
    }

    public SharedPrefHelper getPrefHelper(){
        return prefHelper;
    }
}
