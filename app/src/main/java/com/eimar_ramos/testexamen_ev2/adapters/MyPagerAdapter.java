package com.eimar_ramos.testexamen_ev2.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.eimar_ramos.testexamen_ev2.fragments.FirstFragment;
import com.eimar_ramos.testexamen_ev2.fragments.SecondFragment;
import com.eimar_ramos.testexamen_ev2.fragments.ThirdFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numberOfTabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FirstFragment();
            case 1:return new SecondFragment();
            case 2:return new ThirdFragment();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return this.numberOfTabs;
    }
}
