package com.example.login_app;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = MainActivity.EXTRA_MESSAGE;
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.homeView);
//        textView.setText(message + "显示出来");
        textView.setText(intent.getStringExtra("user_name")
                + "显示出来");
    }
}
