package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button openProfileBtn, openAboutALCBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openAboutALCBtn = findViewById(R.id.aboutALC);
        openProfileBtn = findViewById(R.id.goToProfile);

        openProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openProfileIntent = new Intent(getApplicationContext(),MyProfile.class);
                startActivity(openProfileIntent);
                openProfileIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });

        openAboutALCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutALCIntent = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(openAboutALCIntent);
                openAboutALCIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });
    }
}
