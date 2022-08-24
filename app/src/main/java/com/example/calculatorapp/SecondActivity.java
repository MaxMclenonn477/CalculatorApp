package com.example.calculatorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inside onCreate is where we include any code that helps us set up the screen
        //receive the intent
        Intent intent = getIntent();
        // extract the String
        String nameToShow = intent.getStringExtra("USERNAME");

        // get a reference
        TextView textView = findViewById(R.id.numTwo);
        textView.setText(nameToShow);
    }
}
