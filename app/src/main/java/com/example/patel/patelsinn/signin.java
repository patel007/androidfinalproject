package com.example.patel.patelsinn;

import android.widget.EditText;

/**
 * Created by patel on 2016-04-17.
 */
public class signin {
    private String username;
    private String password;

    public signin(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
}
