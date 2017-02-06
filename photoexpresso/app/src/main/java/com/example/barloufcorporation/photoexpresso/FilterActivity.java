package com.example.barloufcorporation.photoexpresso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);



        Button filterToFormat = (Button) findViewById(R.id.buttonFilterToFormat);

        filterToFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage;
                nextPage = new Intent(FilterActivity.this, FormatActivity.class);
                startActivity(nextPage);
            }
        });
    }
}
