package com.bzcode.appskeletonv14.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bzcode.appskeletonv14.CoreApp;
import com.bzcode.appskeletonv14.utils.AppDialogs;
import com.bzcode.appskeletonv14.utils.SharedPrefHelper;

public abstract class BaseActivity extends AppCompatActivity implements BaseInterface {

    private Context context;
    private AppDialogs progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layout = setUpLayout();
        setContentView(layout);

        context = this;

        progressDialog = new AppDialogs(context);

        initView();

    }

    protected abstract void initView();

    protected Context getContext(){
        return context;
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void log(String msg) {
        Log.e(Config.LOG_COMMON_TAG, msg);
    }

    @Override
    public void showProgress() {
        //show progress
        progressDialog.showProgressBar();
    }

    @Override
    public void hideProgress() {
        //hide progress
        progressDialog.hideProgressbar();
    }


    protected void redirectTo(Class<?> destinationClass, boolean noHistory){

        Intent destinationIntent = new Intent(context, destinationClass);
        startActivity(destinationIntent);

        if(noHistory){
            finish();
        }
    }

    @Override
    public CoreApp getCoreApp() {
        return ((CoreApp)getApplication());
    }

    @Override
    public SharedPrefHelper getPrefHelper() {
        return getCoreApp().getPrefHelper();
    }

}
