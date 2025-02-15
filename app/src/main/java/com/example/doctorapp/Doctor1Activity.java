package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor1Activity extends AppCompatActivity {

    Button doc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor1);

        AppCompatButton doc1 = (AppCompatButton) findViewById(R.id.doc1);
        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.srtrmca.org/index.html");
            }
        });

        AppCompatButton form1 = (AppCompatButton) findViewById(R.id.form1);
        form1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://docs.google.com/forms/d/e/1FAIpQLSerRvH_YmSQdFRMRO2Hg4QkVYUALVALfG1W0tYtRzHMr8GInA/viewform?usp=sf_link");
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}