package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void switchScreens(View veiw){
        //make a reference to the EditText in the xml for the page
        EditText editText = findViewById(R.id.numOne);
        // extract the String text from this editText
        String name = editText.getText().toString();

        // Create the intent () and call its constructor and tell it where the
        //intent is coming from (first param) and where it is going (second param)
        Intent intent = new Intent(this,SecondActivity.class);
        //
        intent.putExtra("USERNAME", name);
        //
        startActivity(intent);
    }

    public void findSum(View view){
        EditText numberOne = findViewById(R.id.numOne);
        EditText numberTwo = findViewById(R.id.numTwo);
        TextView numberSum = findViewById(R.id.result);

        int num1 = Integer.parseInt(numberOne.getText().toString());
        int num2 = Integer.parseInt(numberTwo.getText().toString());
        int sum = num1 + num2;

        numberSum.setText("" + sum);
    }
    public void findSub(View view) {
        EditText numberOne = findViewById(R.id.numOne);
        EditText numberTwo = findViewById(R.id.numTwo);
        TextView numberSum = findViewById(R.id.result);

        int num1 = Integer.parseInt(numberOne.getText().toString());
        int num2 = Integer.parseInt(numberTwo.getText().toString());
        int sum = num1 - num2;

        numberSum.setText("" + sum);
    }

}