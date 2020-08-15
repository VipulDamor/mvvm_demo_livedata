package com.eryushion.mvvm_demo_using_livedata.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eryushion.mvvm_demo_using_livedata.model.User;

public class UserViewModel extends ViewModel {

    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public User user;
    public Context context;

    public UserViewModel(User user, Context context) {
        this.user = user;
        this.context = context;
    }

    public void onClickButton(){

        user.setUsername(username.getValue());
        user.setPassword(password.getValue());

        if (user.isValid()){
            Toast.makeText(context, user.getUsername(), Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "invalid data", Toast.LENGTH_SHORT).show();
        }

    }


}
