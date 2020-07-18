package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pygeon.R;

import com.example.pygeon.classes.PagerAdapter1;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout1 = findViewById(R.id.tabBar1);
        TabItem tab1L1 = findViewById(R.id.tab1L1);
        TabItem tab2L1 = findViewById(R.id.tab2L1);
        TabItem tab3L1 = findViewById(R.id.tab3L1);
        TabItem tab4L1 = findViewById(R.id.tab4L1);
        final ViewPager viewPager = findViewById(R.id.viewPager1);

        PagerAdapter1 pagerAdapter = new PagerAdapter1(getSupportFragmentManager(), tabLayout1.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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