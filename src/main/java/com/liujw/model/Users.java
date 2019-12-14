package com.liujw.model;

import java.io.Serializable;

public class Users implements Serializable {
    private String username;
    private String userpass;

    public Users() {
    }

    public Users(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
}
