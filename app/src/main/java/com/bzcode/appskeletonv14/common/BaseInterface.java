package com.bzcode.appskeletonv14.common;

import com.bzcode.appskeletonv14.CoreApp;
import com.bzcode.appskeletonv14.utils.SharedPrefHelper;

public interface BaseInterface {

    int setUpLayout();
    void showToast(String msg);
    void log(String msg);
    void showProgress();
    void hideProgress();

    CoreApp getCoreApp();
    SharedPrefHelper getPrefHelper();


}
