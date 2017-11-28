package com.llele.mvpmaster;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.githang.statusbar.StatusBarCompat;
import com.llele.mvpmaster.base.BaseActivity;
import com.llele.mvpmaster.ui.comingSoon.ComingSoonFragment;
import com.llele.mvpmaster.ui.intheaters.InTheatersFragment;
import com.llele.mvpmaster.ui.us_box.USBoxFragment;
//import com.llele.mvpmaster.utils.statusbarUitls.Eyes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> list_fragment = new ArrayList<>();
    private List<String> list_Title = new ArrayList<>();
    private MyAdapter mAdapter;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
//        Eyes.setStatusBarColor(MainActivity.this,getColor(R.color.black));
        StatusBarCompat.setStatusBarColor(this, Color.WHITE,true);
        setSwipeBackEnable(false);
        mTabLayout = (TabLayout) findViewById(R.id.tab_main);
        mViewPager = (ViewPager) findViewById(R.id.vp);
        list_fragment.add(new InTheatersFragment());
        list_fragment.add(new ComingSoonFragment());
        list_fragment.add(new USBoxFragment());
        list_Title.add("正在热映");
        list_Title.add("即将上映");
        list_Title.add("排行榜");
        mAdapter = new MyAdapter(getSupportFragmentManager());
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
//        setTranslucent(MainActivity.this);
    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list_fragment.get(position);
        }

        @Override
        public int getCount() {
            return list_Title.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return list_Title.get(position);
        }
    }


}
