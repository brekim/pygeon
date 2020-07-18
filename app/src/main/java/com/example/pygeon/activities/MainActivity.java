package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.example.pygeon.R;

public class MainActivity extends AppCompatActivity {

    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonCredits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view by ID for each Button
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonCredits = findViewById(R.id.buttonCredits);

        //Setting onClickListeners for the menu... right now only one is configured for testing purposes
        buttonOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToPageOne();
            }
        });
    }

    //Temporary
    private void moveToPageOne() {
        Intent intent = new Intent(MainActivity.this, LessonOne.class);
        startActivity(intent);
    }
}