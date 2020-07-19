package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pygeon.R;

public class VictoryScreen extends AppCompatActivity {
    Button goHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory_screen);

        goHome = findViewById(R.id.goHomeButton);
        goHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                moveToHomePage();
            }
        });

    }

    private void moveToHomePage() {
        Intent intent = new Intent(VictoryScreen.this, MainActivity.class);
        startActivity(intent);
    }
}