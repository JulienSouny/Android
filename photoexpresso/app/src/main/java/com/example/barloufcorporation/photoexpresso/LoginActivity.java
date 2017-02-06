package com.example.barloufcorporation.photoexpresso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

class LoginActivity extends AppCompatActivity {

    Button mainToNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginToHome = (Button) findViewById(R.id.buttonLoginToHome);
        Button loginToCreateAccount = (Button) findViewById(R.id.buttonLoginToCreateAccount);

        loginToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage;
                nextPage = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(nextPage);
            }
        });

        loginToCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage;
                nextPage = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(nextPage);
            }
        });



    }
}
