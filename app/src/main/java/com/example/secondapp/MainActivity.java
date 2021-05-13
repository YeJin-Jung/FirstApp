package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

import java.net.Inet4Address;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stw = (Button) findViewById(R.id.stopwatch);
        Button bsc = (Button) findViewById(R.id.BScheck);
        Button bsl = (Button) findViewById(R.id.BSlist);
        Button grp = (Button) findViewById(R.id.Graph);
        Button cal = (Button) findViewById(R.id.Calendar);
        Button adal = (Button) findViewById(R.id.Addal);
        Button smt = (Button) findViewById(R.id.Smt);
        Button pis = (Button) findViewById(R.id.Pills);
        stw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),stopwatch.class);
                startActivity(intent);
            }
        });
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BScheck.class);
                startActivity(intent);
            }
        });
        bsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BSlist.class);
                startActivity(intent);
            }
        });
        grp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Graph.class);
                startActivity(intent);
            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Calendar.class);
                startActivity(intent);
            }
        });
        adal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Addalarm.class);
                startActivity(intent);
            }
        });
        smt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SetMT.class);
                startActivity(intent);
            }
        });
        pis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pillsetting.class);
                startActivity(intent);
            }
        });
    }
    
}