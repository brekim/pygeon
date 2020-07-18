package com.example.pygeon.classes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pygeon.fragments.tab1lesson1;
import com.example.pygeon.fragments.tab2lesson1;
import com.example.pygeon.fragments.tab3lesson1;
import com.example.pygeon.fragments.tab4lesson1;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tab1lesson1();
            case 1:
                return new tab2lesson1();
            case 2:
                return new tab3lesson1();
            case 3:
                return new tab4lesson1();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
