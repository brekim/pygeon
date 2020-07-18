package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pygeon.R;

import com.example.pygeon.classes.PagerAdapter5;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout5 = findViewById(R.id.tabBar5);
        TabItem tab1L5 = findViewById(R.id.tab1L5);
        TabItem tab2L5 = findViewById(R.id.tab2L5);
        TabItem tab3L5 = findViewById(R.id.tab3L5);
        TabItem tab4L5 = findViewById(R.id.tab4L5);
        final ViewPager viewPager = findViewById(R.id.viewPager5);

        PagerAdapter5 pagerAdapter = new PagerAdapter5(getSupportFragmentManager(), tabLayout5.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout5.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}