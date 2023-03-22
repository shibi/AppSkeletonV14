package com.bzcode.appskeletonv14.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bzcode.appskeletonv14.common.BaseFragment;
import com.bzcode.appskeletonv14.databinding.LoginFragmentBinding;

public class LoginFragment extends BaseFragment<LoginFragmentBinding> {

    @Override
    protected LoginFragmentBinding bindView(LayoutInflater inflater, ViewGroup container) {
        return LoginFragmentBinding.inflate(inflater, container, false);
    }

    @Override
    protected void onViewCreated() {

    }


}
