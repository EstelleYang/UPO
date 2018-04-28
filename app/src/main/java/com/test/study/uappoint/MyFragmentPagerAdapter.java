package com.test.study.uappoint;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "MyFragmentPagerAdapter";
    private final int PAGER_COUNT = 4;
    private MainpageFragment mainpageFragment = null;
    private LearningFragment learningFragment = null;
    private PacsFragment pacsFragment = null;
    private MineFragment mineFragment =null;

    public MyFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
        Log.d(TAG, "MyFragmentPagerAdapter: *******************");
        mainpageFragment = new MainpageFragment();
        
        learningFragment = new LearningFragment();
        pacsFragment = new PacsFragment();
        mineFragment = new MineFragment();
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case MainActivity.PAGE_ONE:
                fragment = mainpageFragment;
                break;
            case MainActivity.PAGE_TWO:
                fragment = learningFragment;
                break;
            case MainActivity.PAGE_THREE:
                fragment = pacsFragment;
                break;
            case MainActivity.PAGE_FOUR:
                fragment = mineFragment;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGER_COUNT;
    }
    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        Log.d(TAG, "destroyItem: ***position Destory"+position);
        super.destroyItem(container, position, object);
    }
}