package com.bzcode.appskeletonv14;

import android.view.LayoutInflater;

import com.bzcode.appskeletonv14.common.BaseActivity;
import com.bzcode.appskeletonv14.databinding.ActivityMainBinding;
import com.bzcode.appskeletonv14.databinding.LoginFragmentBinding;


public class MainActivity extends BaseActivity<ActivityMainBinding> {


    @Override
    protected ActivityMainBinding bindView(LayoutInflater inflater) {
        return ActivityMainBinding.inflate(inflater);

    }

    @Override
    protected void initView() {


        //redirectTo(MainActivity.class , true);

    }
}