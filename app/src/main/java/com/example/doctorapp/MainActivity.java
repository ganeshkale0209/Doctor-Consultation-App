package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //Ganeshkale and Ganesh@123

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Ganeshkale") && password.getText().toString().equals("Ganesh@123"))
                {
                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "WEL-COME", Toast.LENGTH_SHORT).show();
                }

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "WEL-COME", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(MainActivity.this, "ERROR UNAUTHORIZED USER", Toast.LENGTH_SHORT).show();
            }
        });
    }
}