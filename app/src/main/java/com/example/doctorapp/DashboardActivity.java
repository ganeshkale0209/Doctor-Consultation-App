package com.example.doctorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
Toolbar toolbar;
ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setSupportActionBar(toolbar);

        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AppCompatButton doctor1 = (AppCompatButton) findViewById(R.id.doctor1);

        doctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, Doctor1Activity.class);
                startActivity(intent);

            } });
        AppCompatButton doctor2 = (AppCompatButton) findViewById(R.id.doctor2);

        doctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, Doctor2Activity.class);
                startActivity(intent);

            } });

        AppCompatButton doctor3 = (AppCompatButton) findViewById(R.id.doctor3);

        doctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, Doctor3Activity.class);
                startActivity(intent);

            } });

        AppCompatButton doctor4 = (AppCompatButton) findViewById(R.id.doctor4);

        doctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, Doctor4Activity.class);
                startActivity(intent);

            } });

        AppCompatButton heart = (AppCompatButton) findViewById(R.id.heart);

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, HeartActivity.class);
                startActivity(intent);

            } });

        AppCompatButton teeth = (AppCompatButton) findViewById(R.id.teeth);

        teeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, TeethActivity.class);
                startActivity(intent);

            } });

        AppCompatButton eye = (AppCompatButton) findViewById(R.id.eye);

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, EyeActivity.class);
                startActivity(intent);

            } });

        AppCompatButton brain = (AppCompatButton) findViewById(R.id.brain);

        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(DashboardActivity.this, BrainActivity.class);
                startActivity(intent);

            } });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
