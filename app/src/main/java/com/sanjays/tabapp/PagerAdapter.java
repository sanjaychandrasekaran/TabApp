package com.sanjays.tabapp;


//import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

 PagerAdapter(FragmentManager fm,int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

//    public PagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
//        super();
//    }

//    public PagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
//        super(supportFragmentManager, tabCount);
//    }




    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                return  new ChatsFragment();
            case 1 :
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;


        }


    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
