package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Intro2 extends AppCompatActivity {
public static final long SPLASH_SCREEN_DELAY=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        TimerTask time=new TimerTask() {
            @Override
            public void run() {
                Intent intento=new Intent().setClass(Intro2.this,MainActivity.class);
                startActivity(intento);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}