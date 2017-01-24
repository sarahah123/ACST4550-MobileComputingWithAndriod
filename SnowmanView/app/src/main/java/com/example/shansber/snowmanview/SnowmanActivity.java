package com.example.shansber.snowmanview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * Course:          ACST 4550
 * Section:         01
 * Name:            Sarah Hansberry
 * Professor:       Shaw
 * Assignment #:    Lab2
 */

public class SnowmanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SnowmanView view = new SnowmanView(this);
        setContentView(view);
    }
}
