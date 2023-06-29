package com.example.a225project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class nurseNewReports extends AppCompatActivity {

    ImageView Blood, Urine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurse_new_reports);

        Blood = findViewById(R.id.imageView140);
        Urine = findViewById(R.id.imageView141);

        Blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), nurseBloodReport.class));

            }
        });

        Urine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), nurseUrineReport.class));

            }
        });
    }
}