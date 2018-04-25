package com.example.ahmadnprimordi.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> isFragment = new ArrayList<>();
    private final List<String> isTitles = new ArrayList<>();



    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
        public android.support.v4.app.Fragment getItem(int position) {
        return isFragment.get(position);
    }

    @Override
    public int getCount() {
        return isTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return isTitles.get(position);
    }

    public void AddFragment (Fragment fragment, String title) {
        isFragment.add(fragment);
        isTitles.add(title);
    }
}
