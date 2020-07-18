package com.example.pygeon.classes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pygeon.fragments.tab1lesson5;
import com.example.pygeon.fragments.tab2lesson5;
import com.example.pygeon.fragments.tab3lesson5;
import com.example.pygeon.fragments.tab4lesson5;

public class PagerAdapter5 extends FragmentPagerAdapter {
    private int numOfTabs;

    public PagerAdapter5(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tab1lesson5();
            case 1:
                return new tab2lesson5();
            case 2:
                return new tab3lesson5();
            case 3:
                return new tab4lesson5();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
