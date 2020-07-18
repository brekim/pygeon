package com.example.pygeon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pygeon.R;

import com.example.pygeon.classes.PagerAdapter2;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout2 = findViewById(R.id.tabBar2);
        TabItem tab1L2 = findViewById(R.id.tab1L2);
        TabItem tab2L2 = findViewById(R.id.tab2L2);
        TabItem tab3L2 = findViewById(R.id.tab3L2);
        TabItem tab4L2 = findViewById(R.id.tab4L2);
        final ViewPager viewPager = findViewById(R.id.viewPager2);

        PagerAdapter2 pagerAdapter = new PagerAdapter2(getSupportFragmentManager(), tabLayout2.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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