package com.example.barloufcorporation.photoexpresso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdressCreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress_creation);

        Button adressCreationToAdressSelection = (Button) findViewById(R.id.buttonAdressCreationToAdressSelection);

        adressCreationToAdressSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage;
                nextPage = new Intent(AdressCreationActivity.this, AdressSelectionActivity.class);
                startActivity(nextPage);
            }
        });
    }
}
