package com.example.colorizemobile.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.colorizemobile.R;

public class LoginActivity extends AppCompatActivity {

    //private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //loginButton = findViewById(R.id.log_button);
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(LoginActivity.this,
//                        MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
    }
}
