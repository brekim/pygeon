package com.example.pygeon.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pygeon.classes.Question;
import com.example.pygeon.R;

import java.util.ArrayList;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    //Control System
    TextView tvQuizCounter, tvQuizQuestion, tvQuizStatus;
    Button buttonA, buttonB, buttonC, buttonD;

    //Quiz List
    ArrayList<Question> questionList = new ArrayList<>();
    int index = 0;

    //Health System
    int enemyHP = 15;
    int maxEnemyHP = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Find view by ID for each TextView
        tvQuizCounter = findViewById(R.id.tvQuizCounter);
        tvQuizQuestion = findViewById(R.id.tvQuizQuestion);
        tvQuizStatus = findViewById(R.id.tvQuizStatus);

        //Find view by ID for each Button
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);

        //Load questions and answers into the application
        load(1);
        index = 0;

        loadQuestions(index);
    }

    public void loadQuestions(int i) {
        if(enemyHP > 0) {
            //Loads the new question here with the correct data
            final Question quest = questionList.get(i);
            tvQuizCounter.setText(enemyHP + "/" + maxEnemyHP + " HP");
            tvQuizQuestion.setText(quest.getQuestion());
            buttonA.setText(quest.getA());
            buttonB.setText(quest.getB());
            buttonC.setText(quest.getC());
            buttonD.setText(quest.getD());

            buttonA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (buttonA.getText().equals(quest.getCorrectAnswer())) {
                        takeDamage();
                        loadQuestions(generateNewIndex());
                    } else {
                        healDamage();
                        loadQuestions(generateNewIndex());
                    }
                }
            });

            buttonB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (buttonB.getText().equals(quest.getCorrectAnswer())) {
                        takeDamage();
                        loadQuestions(generateNewIndex());
                    } else {
                        healDamage();
                        loadQuestions(generateNewIndex());
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (buttonC.getText().equals(quest.getCorrectAnswer())) {
                        takeDamage();
                        loadQuestions(generateNewIndex());
                    } else {
                        healDamage();
                        loadQuestions(generateNewIndex());
                    }
                }
            });

            buttonD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (buttonD.getText().equals(quest.getCorrectAnswer())) {
                        takeDamage();
                        loadQuestions(generateNewIndex());
                    } else {
                        healDamage();
                        loadQuestions(generateNewIndex());
                    }
                }
            });
        } else {
            enemyDefeated();
        }
    }

    //Used to concisely generate a random question
    public int generateNewIndex() {
        int numElements = questionList.size();

        Random r = new Random();
        return r.nextInt(numElements);
    }

    public void takeDamage() {
        if(enemyHP != 0) {
            tvQuizCounter.setText(enemyHP + "/" + maxEnemyHP + " HP");
            tvQuizStatus.setTextColor(Color.parseColor("#3dcc8e"));
            tvQuizStatus.setText("Correct! Enemy took 3 damage.");
            enemyHP -= 3;
        }
    }

    public void healDamage() {
        if(enemyHP != 0) {
            tvQuizCounter.setText(enemyHP + "/" + maxEnemyHP + " HP");
            tvQuizStatus.setTextColor(Color.parseColor("#f44336"));
            tvQuizStatus.setText("Incorrect! Enemy healed 2 damage.");
            enemyHP += 2;
        }
    }

    public void enemyDefeated() {
        enemyHP = 0;
        tvQuizCounter.setText(enemyHP + "/" + maxEnemyHP + " HP");
        tvQuizStatus.setText("You win!");

        /*
         * CODE THAT GETS THE QUIZ TO GO TO THE WIN SCREEN NEEDED HERE
         */
    }

    public void load(int i) {
        /*
         * NEED TO UPDATE THIS
         */

        if (i == 1) {
            // Level One: Variables
            questionList.clear();
            questionList.add(new Question("What is a valid variable name in Python?", "dog$", "cats", "100dogs", "several-cats", "cats"));
            questionList.add(new Question("What data type is person = \"Mama\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What data type is apples = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What data type is score = 5.6", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What data type is alive = true", "String", "int", "double", "boolean", "boolean"));
        } else if (i == 2) {
            // Level Two: Syntax
            questionList.clear();
            questionList.add(new Question("What is a valid variable name in Python?", "dog$", "cats", "100dogs", "several-cats", "cats"));
            questionList.add(new Question("What data type is person = \"Mama\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What data type is apples = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What data type is score = 5.6", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What data type is alive = true", "String", "int", "double", "boolean", "boolean"));
        } else if (i == 3) {
            // Level Three: Control Structures
            questionList.clear();
            questionList.add(new Question("What is a valid variable name in Python?", "dog$", "cats", "100dogs", "several-cats", "cats"));
            questionList.add(new Question("What data type is person = \"Mama\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What data type is apples = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What data type is score = 5.6", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What data type is alive = true", "String", "int", "double", "boolean", "boolean"));
        } else if (i == 4) {
            // Level Four: Arrays
            questionList.clear();
            questionList.add(new Question("What is a valid variable name in Python?", "dog$", "cats", "100dogs", "several-cats", "cats"));
            questionList.add(new Question("What data type is person = \"Mama\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What data type is apples = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What data type is score = 5.6", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What data type is alive = true", "String", "int", "double", "boolean", "boolean"));
        } else if (i == 5) {
            // Level Five: Loops
            questionList.clear();
            questionList.add(new Question("What is a valid variable name in Python?", "dog$", "cats", "100dogs", "several-cats", "cats"));
            questionList.add(new Question("What data type is person = \"Mama\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What data type is apples = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What data type is score = 5.6", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What data type is alive = true", "String", "int", "double", "boolean", "boolean"));
        }
    }
}