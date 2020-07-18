package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pygeon.R;

import com.example.pygeon.classes.PagerAdapter3;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout3 = findViewById(R.id.tabBar3);
        TabItem tab1L3 = findViewById(R.id.tab1L3);
        TabItem tab2L3 = findViewById(R.id.tab2L3);
        TabItem tab3L3 = findViewById(R.id.tab3L3);
        TabItem tab4L3 = findViewById(R.id.tab4L3);
        final ViewPager viewPager = findViewById(R.id.viewPager3);

        PagerAdapter3 pagerAdapter = new PagerAdapter3(getSupportFragmentManager(), tabLayout3.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout3.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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