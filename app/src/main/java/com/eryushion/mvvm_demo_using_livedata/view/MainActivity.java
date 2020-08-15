package com.eryushion.mvvm_demo_using_livedata.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.eryushion.mvvm_demo_using_livedata.R;
import com.eryushion.mvvm_demo_using_livedata.databinding.ActivityMainBinding;
import com.eryushion.mvvm_demo_using_livedata.model.User;
import com.eryushion.mvvm_demo_using_livedata.viewmodel.UserViewModel;
import com.eryushion.mvvm_demo_using_livedata.viewmodel.UserViewModelFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserViewModel userViewModel = ViewModelProviders.of(this,new UserViewModelFactory(this,new User()))
                .get(UserViewModel.class);
        mainBinding.setViewmodel(userViewModel);
    }
}
