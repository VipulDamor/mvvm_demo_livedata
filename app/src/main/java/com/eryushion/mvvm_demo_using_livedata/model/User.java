package com.eryushion.mvvm_demo_using_livedata.model;

import android.text.TextUtils;

public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return getUsername() != null && !TextUtils.isEmpty(getUsername().toString()) && getPassword() != null
                && !TextUtils.isEmpty(getPassword().toString());
    }

}
