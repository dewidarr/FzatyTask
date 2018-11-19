package com.example.dewidar.fzatytask;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FzatyOptionAdapter extends FragmentPagerAdapter {
    public FzatyOptionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragment_waitting();
                break;
            case 1:
                fragment = new Fragment_accepted();
                break;
            case 2:
                fragment = new Fragment_cancled();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
