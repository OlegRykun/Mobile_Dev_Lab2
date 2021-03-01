package com.example.ua.kpi.comsys.io8218;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private  final ArrayList<Fragment> listFragment = new ArrayList<>();
    private final ArrayList<String> listTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitles.get(position);
    }

    public void AddFragment(Fragment fragment, String title) {
        listFragment.add(fragment);
        listTitles.add(title);
    }
}
