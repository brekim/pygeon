package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

        buttonTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToPageTwo();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToPageThree();
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToPageFour();
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToPageFive();
            }
        });

        //Temporarily goes to quiz
        buttonCredits.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToCredits();
            }
        });
    }

    private void moveToPageOne() {
        Intent intent = new Intent(MainActivity.this, LessonOne.class);
        startActivity(intent);
    }

    private void moveToPageTwo() {
        Intent intent = new Intent(MainActivity.this, LessonTwo.class);
        startActivity(intent);
    }

    private void moveToPageThree() {
        Intent intent = new Intent(MainActivity.this, LessonThree.class);
        startActivity(intent);
    }

    private void moveToPageFour() {
        Intent intent = new Intent(MainActivity.this, LessonFour.class);
        startActivity(intent);
    }

    private void moveToPageFive() {
        Intent intent = new Intent(MainActivity.this, LessonFive.class);
        startActivity(intent);
    }

    //For beta testing... temporarily goes to the quiz
    private void moveToCredits() {
        Intent intent = new Intent(MainActivity.this, QActivity2.class);
        startActivity(intent);
    }
}