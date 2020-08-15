package com.eryushion.mvvm_demo_using_livedata.viewmodel;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.eryushion.mvvm_demo_using_livedata.model.User;
import com.eryushion.mvvm_demo_using_livedata.view.MainActivity;

public class UserViewModelFactory implements ViewModelProvider.Factory {

    private Context context;
    private User user;

    public UserViewModelFactory(MainActivity mainActivity, User user) {
        this.context = mainActivity;
        this.user = user;

    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new UserViewModel(user,context);
    }
}
