package com.bzcode.appskeletonv14.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import com.bzcode.appskeletonv14.CoreApp;
import com.bzcode.appskeletonv14.utils.SharedPrefHelper;

public abstract class BaseFragment<T extends ViewBinding> extends Fragment implements BaseInterface{

    public T binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = bindView(inflater, container);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onViewCreated();
    }

    protected abstract T bindView(LayoutInflater inflater, ViewGroup container);
    protected abstract void onViewCreated();

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void log(String msg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public CoreApp getCoreApp() {
        return null;
    }

    @Override
    public SharedPrefHelper getPrefHelper() {
        return null;
    }
}
