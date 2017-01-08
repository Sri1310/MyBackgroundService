package com.example.kannan.mybackgroundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







    }

    public void startService(View v)
    {
        Intent i = new Intent(this,SriService.class);
        startService(i);
    }

    public void stopService(View v)
    {
        Intent i = new Intent(this,SriService.class);
        stopService(i);
    }
}
