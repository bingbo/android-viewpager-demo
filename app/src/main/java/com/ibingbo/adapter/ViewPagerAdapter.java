package com.ibingbo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ibingbo.fragment.PlaceholderFragment;

/**
 * Created by zhangbingbing on 16/9/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return PlaceholderFragment.newInstance(String.valueOf(position),String.valueOf(position));
            default:
                return PlaceholderFragment.newInstance(String.valueOf(position),String.valueOf(position));
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
