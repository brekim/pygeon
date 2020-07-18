package com.example.pygeon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

//Needed for the text interface
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

//Java that will be useful for setting up the quiz
import java.util.ArrayList;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}