package com.example.pygeon.activities;

import android.content.Intent;
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

public class QActivity5 extends AppCompatActivity {

    //Control System
    TextView tvQuizCounter, tvQuizQuestion, tvQuizStatus;
    Button buttonA, buttonB, buttonC, buttonD, buttonVictory;

    //Quiz List
    ArrayList<Question> questionList = new ArrayList<>();
    int index = 0;

    //Health System
    int enemyHP = 15;
    int maxEnemyHP = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        //Find view by ID for each TextView
        tvQuizCounter = findViewById(R.id.tvQuizCounter);
        tvQuizQuestion = findViewById(R.id.tvQuizQuestion);
        tvQuizStatus = findViewById(R.id.tvQuizStatus);

        //Find view by ID for each Button
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);
        buttonVictory = findViewById(R.id.buttonVictory);

        //Load questions and answers into the application
        load(5);
        index = 0;

        loadQuestions(index);
    }

    public void loadQuestions(int i) {
        if (enemyHP > 0) {
            //Loads the new question here with the correct data
            final Question quest = questionList.get(i);
            tvQuizCounter.setText("Minotaur: " + enemyHP + "/" + maxEnemyHP + " HP");
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

            buttonVictory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    moveToAwardFour();
                }
            });
        } else {
            enemyDefeated();
        }
    }

    //Used to concisely generate a random question
    private int generateNewIndex() {
        int numElements = questionList.size();

        Random r = new Random();
        return r.nextInt(numElements);
    }

    private void takeDamage() {
        if (enemyHP != 0) {
            tvQuizCounter.setText("Minotaur: " + enemyHP + "/" + maxEnemyHP + " HP");
            tvQuizStatus.setTextColor(Color.parseColor("#3dcc8e"));
            tvQuizStatus.setText("Correct! Enemy took 3 damage.");

            enemyHP -= 3;
        }
    }

    private void healDamage() {
        if (enemyHP != 0) {
            if (enemyHP <= 12) {
                tvQuizCounter.setText("Minotaur: " + enemyHP + "/" + maxEnemyHP + " HP");
                tvQuizStatus.setTextColor(Color.parseColor("#f44336"));
                tvQuizStatus.setText("Incorrect! Enemy healed 2 damage.");
                enemyHP += 2;
            } else if (enemyHP == 15) {
                tvQuizStatus.setTextColor(Color.parseColor("#f44336"));
                tvQuizStatus.setText("Incorrect! Enemy is already at max health.");
            } else {
                int difference = maxEnemyHP - enemyHP;
                tvQuizStatus.setTextColor(Color.parseColor("#f44336"));
                tvQuizStatus.setText("Incorrect! Enemy healed " + difference + " damage.");
                enemyHP += difference;
            }
        }
    }

    private void enemyDefeated() {
        enemyHP = 0;
        tvQuizCounter.setText("Minotaur: " + enemyHP + "/" + maxEnemyHP + " HP");
        tvQuizStatus.setText("You win!");

        /*
         * CODE THAT GETS THE QUIZ TO GO TO THE WIN SCREEN NEEDED HERE
         */
        tvQuizQuestion.setVisibility(View.INVISIBLE);
        buttonA.setVisibility(View.INVISIBLE);
        buttonB.setVisibility(View.INVISIBLE);
        buttonC.setVisibility(View.INVISIBLE);
        buttonD.setVisibility(View.INVISIBLE);
        buttonVictory.setVisibility(View.VISIBLE);
    }

    private void load(int i) {
        // Level One: Variables
        questionList.clear();

        if (i == 1) {
            questionList.add(new Question("What type is the variable answer? answer = \"B\"", "String", "int", "double", "boolean", "String"));
            questionList.add(new Question("What type is the variable num_cats? num_cats = 4", "String", "int", "double", "boolean", "int"));
            questionList.add(new Question("What type is the variable cash? cash = 4.35", "String", "int", "double", "boolean", "double"));
            questionList.add(new Question("What type is the variable alive? alive = True", "String", "int", "double", "boolean", "boolean"));
            questionList.add(new Question("Which math operations can you use with Python?", "Addition (+)", "Subtraction (-)", "Multiplication (*)", "All of the above and more!", "All of the above and more!"));
            questionList.add(new Question("How do you print things to the console in Python?", "print = \"Fruit\"", "sole(\"Fruit\")", "print(\"Fruit\")", "console.Fruit", "print(\"Fruit\")"));
            questionList.add(new Question("What is a valid variable name in Python?", "23dogs", "dog$", "-dogs", "dogs", "dogs"));
            questionList.add(new Question("What is the parameter in this print statement? print(\"Cake\")", "\"Cake\"", "print", "(\"\")", "Cake", "\"Cake\""));
            questionList.add(new Question("What type is the variable fruit? fruit = [\"Apple\", \"Orange\", \"Banana\"]", "int", "double", "list", "boolean", "list"));
            questionList.add(new Question("What is the type of the parameter? wait(\"200\")", "String", "int", "double", "boolean", "String"));
        } else if (i == 2) {
            questionList.add(new Question("Which variable is correctly defined?", "buttonPressed.True", "True buttonPressed", "buttonPressed = True", "True = buttonPressed", "buttonPressed = True"));
            questionList.add(new Question("Which comment is correctly defined?", "# This is a comment", "// This is a comment", "\"This is a comment\"", "This is a comment", "# This is a comment"));
            questionList.add(new Question("What is the name of this variable? age = 14", "age = 14", "age", "age14", "14", "age"));
            questionList.add(new Question("What is the value of this variable? age = 14", "age = 14", "age", "age14", "14", "14"));
            questionList.add(new Question("What naming convention does Python recommend?", "Upper camel case (VarName)", "Camel case (varName)", "Snake case (var_name)", "Kebab Case (var-name)", "Snake case (var_name)"));
            questionList.add(new Question("What variable name is a reserved keyboard and cannot be used as a variable name?", "rpm", "double", "num_cats", "numberCats", "double"));
            questionList.add(new Question("How do you call the startswith function from String s?", "startswith(s)", "startswith.String", "s.startsWith()", "s.startsWith", "s.startsWith()"));
            questionList.add(new Question("What is a parameter?", "A unit of measurement", "A given value to a function", "A data type", "A function", "A given value to a function"));
            questionList.add(new Question("What is the proper syntax to call the print function?", "print()", "print{}", "print[]", "print", "print()"));
            questionList.add(new Question("Say name() returns a String value. What line of code sets name() to a variable x?", "x.name()", "x = name()", "name(x)", "x = name", "x = name()"));
        } else if (i == 3) {
            questionList.add(new Question("What data type can be True or False?", "String", "int", "double", "boolean", "boolean"));
            questionList.add(new Question("Which pair contains both boolean operators?", "True, or", "and, False", "True, False", "and, or", "and, or"));
            questionList.add(new Question("Which pair contains both boolean values?", "True, or", "and, False", "True, False", "and, or", "True, False"));
            questionList.add(new Question("What does (isFun and isPlayable) evaluate to if isFun = True and isPlayable = False)?", "True", "False", "and", "None of the above", "False"));
            questionList.add(new Question("What does (isFun or isPlayable) evaluate to if isFun = True and isPlayable = False)?", "True", "False", "and", "None of the above", "True"));
            questionList.add(new Question("What will print to the console from if isFun: print(“It’s fun”) when isFun = True?", "It’s fun", "\"It's\"fun", "print(“It’s fun”)", "Nothing", "It’s fun"));
            questionList.add(new Question("What will print to the console from if num_cakes == 5: num_cakes == 6 if num_cakes == 6: print(“Six cakes”), when num_cakes = 5?", "Six cakes", "True", "False", "Nothing will print", "Six cakes"));
            questionList.add(new Question("What will print to the console from if num_cakes == 5: num_cakes == 6 elif num_cakes == 6: print(“Six cakes”), when num_cakes = 5?", "Six cakes", "True", "False", "Nothing will print", "Nothing will print"));
            questionList.add(new Question("What will print to the console from if isRed: print(“It’s red”) else: print(“It’s not red”), when isRed = True?", "It's red", "It's not red", "\"It's red\"", "\"It's not red\"", "It's red"));
            questionList.add(new Question("What will print to the console from if isRed: print(“It’s red”) else: print(“It’s not red”), when isRed = False?", "It's red", "It's not red", "\"It's red\"", "\"It's not red\"", "It's not red"));
        } else if (i == 4) {
            questionList.add(new Question("Which points list is properly defined?", "points = {33.3, 45.6, 35.5, 0.14}", "points = 33.3, 45.6, 35.5, 0.49", "points = [23.3, 41.5, 6.53, 0.84]", "points [23.3, 41.5, 6.53, 0.84]", "points = [23.3, 41.5, 6.53, 0.84]"));
            questionList.add(new Question("Select the first element of prices = [23.3, 41.5, 6.53, 0.84]", "prices[0]", "prices[1]", "prices[2]", "prices[23.3]", "prices[0]"));
            questionList.add(new Question("Select the second element of prices = [23.3, 41.5, 6.53, 0.84]", "prices[0]", "prices[1]", "prices[2]", "prices[23.3]", "prices[1]"));
            questionList.add(new Question("What is the 1 in pets[1] called?", "A position", "A number", "An index", "A spot", "An index"));
            questionList.add(new Question("prices is a list that contains 4. How can you find the index of 4?", "prices[3]", "prices[4]", "prices.index(3)", "prices.index(4)", "prices.index(4)"));
            questionList.add(new Question("How would you add the number 6 to the end of the prices list?", "prices.add(6)", "prices.append(6)", "prices[6]", "append(6)", "prices.append(6)"));
            questionList.add(new Question("How would you sort a list of numbers named prices from least to greatest?", "prices.sort()", "sort(prices)", "prices.sort", "prices[]", "prices.sort()"));
            questionList.add(new Question("How would you remove the 2nd element, the number 34, of the list numbers?", "numbers.pop(1)", "numbers.pop(2)", "numbers.pop(34)", "numbers.remove(34)", "numbers.pop(1)"));
            questionList.add(new Question("How would you insert the string “Gold” at index 2 in the list chemistry?", "chemistry.insert(1, “Gold”)", "chemistry.insert(2, “Gold”)", "chemistry.insert(“Gold”, 1)", "chemistry.insert(“Gold”, 2)", "chemistry.insert(2, “Gold”)"));
            questionList.add(new Question("In the list points [23.3, 41.5, 6.53, 0.84], what is the position and index of 0.84?", "Position: 2, Index: 2", "Position: 3, Index: 3", "Position: 2, Index: 3", "Position: 3, Index: 2", "Position: 3, Index: 2"));
        } else if (i == 5) {
            questionList.add(new Question("What is the object in (for book in books)?", "for", "book", "in", "books", "book"));
            questionList.add(new Question("When will a while loop stop?", "When its condition is True", "When its condition is False", "Never, a while loop runs constantly", "None of the above", "When its condition is False"));
            questionList.add(new Question("How do you loop through a 5-element list numbers by object?", "for numbers", "for number in numbers", "for numbers in numbers", "for i in range(0, 5)", "for number in numbers"));
            questionList.add(new Question("How do you loop through a 5-element list numbers using a numerical index?", "for numbers", "for number in numbers", "for numbers in numbers", "for i in range(0, 5)", "for i in range(0, 5)"));
            questionList.add(new Question("Does the index variable in a numerical index for loop need to be i?", "Yes, Python requires it", "Sometimes, only with lists", "Sometimes, only with indexes", "No, the index variable can vary in name", "No, the index variable can vary in name"));
            questionList.add(new Question("How many times will for i in range(4, 8): print(“Banana”) print Banana?", "3", "4", "5", "8", "4"));
            questionList.add(new Question("Can if and else loops exist inside of for loops?", "Yes", "Sometimes, only with integers", "Sometimes, only with Strings", "Never", "Yes"));
            questionList.add(new Question("When looping through a loop, is a for loop or while loop easier to implement?", "For loop, because the code is longer", "For loop, because the code is shorter", "While loop, because the code is longer", "While loop, because the code is shorter", "For loop, because the code is shorter"));
            questionList.add(new Question("Can we track position with a for loop that cycles through objects in a list?", "Yes, always", "Sometimes at random", "Not by itself, but with an incrementing index", "No", "Not by itself, but with an incrementing index"));
            questionList.add(new Question("What is the list in (for book in books)?", "for", "book", "in", "books", "books"));
        }
    }

    private void moveToAwardFour() {
        Intent intent = new Intent(QActivity5.this, MainActivity.class);
        startActivity(intent);
    }
}