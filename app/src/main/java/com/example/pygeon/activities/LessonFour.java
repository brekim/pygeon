package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pygeon.R;

import com.example.pygeon.classes.PagerAdapter4;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout4 = findViewById(R.id.tabBar4);
        TabItem tab1L4 = findViewById(R.id.tab1L4);
        TabItem tab2L4 = findViewById(R.id.tab2L4);
        TabItem tab3L4 = findViewById(R.id.tab3L4);
        TabItem tab4L4 = findViewById(R.id.tab4L4);
        final ViewPager viewPager = findViewById(R.id.viewPager4);

        PagerAdapter4 pagerAdapter = new PagerAdapter4(getSupportFragmentManager(), tabLayout4.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout4.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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