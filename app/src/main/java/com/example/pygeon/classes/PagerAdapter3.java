package com.example.pygeon.classes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pygeon.fragments.tab1lesson3;
import com.example.pygeon.fragments.tab2lesson3;
import com.example.pygeon.fragments.tab3lesson3;
import com.example.pygeon.fragments.tab4lesson3;

public class PagerAdapter3 extends FragmentPagerAdapter {
    private int numOfTabs;

    public PagerAdapter3(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tab1lesson3();
            case 1:
                return new tab2lesson3();
            case 2:
                return new tab3lesson3();
            case 3:
                return new tab4lesson3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
