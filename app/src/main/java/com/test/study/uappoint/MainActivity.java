package com.test.study.uappoint;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,ViewPager.OnPageChangeListener {

    //定义四个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    //加载layout控件
    private RadioGroup radioGroup;
    private ViewPager viewPager;
    private RadioButton mainpage;
    private RadioButton learnpage;
    private RadioButton minepage;
    private RadioButton pacspage;
    private Toolbar toolbar;
    private TextView textView;
    //private String toolbarName = "信之源";

    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: is running");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindView();
        mainpage.setChecked(true);
    }

    private void bindView(){
        radioGroup = (RadioGroup)findViewById(R.id.rg_tab_bar);
        mainpage = (RadioButton)findViewById(R.id.rb_mainPage);
        learnpage = (RadioButton)findViewById(R.id.rb_helpPage);
        pacspage = (RadioButton)findViewById(R.id.rb_reportPage);
        minepage = (RadioButton)findViewById(R.id.rb_minePage);
        viewPager = (ViewPager)findViewById(R.id.vpager);

        toolbar = (Toolbar)findViewById(R.id.id_toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        textView = (TextView)findViewById(R.id.toolbar_name);
        textView.setText("信之源");
        textView.setTextSize(16);
        radioGroup.setOnCheckedChangeListener(this);

        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_mainPage:
                viewPager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_helpPage:
                viewPager.setCurrentItem(PAGE_TWO);
                textView.setText("辅助诊断");
                break;
            case R.id.rb_reportPage:
                viewPager.setCurrentItem(PAGE_THREE);
                textView.setText("检查报告");
                break;
            case R.id.rb_minePage:
                viewPager.setCurrentItem(PAGE_FOUR);
                toolbar.setVisibility(View.GONE);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (viewPager.getCurrentItem()) {
                case PAGE_ONE:
                    mainpage.setChecked(true);
                    break;
                case PAGE_TWO:
                    learnpage.setChecked(true);
                    break;
                case PAGE_THREE:
                    pacspage.setChecked(true);
                    break;
                case PAGE_FOUR:
                    minepage.setChecked(true);
                    break;
            }
        }
    }
}
