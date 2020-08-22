package com.example.login_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.example.login_app.ui.login.LoginActivity;

@SuppressLint("Registered")
public class MainActivity extends LoginActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}