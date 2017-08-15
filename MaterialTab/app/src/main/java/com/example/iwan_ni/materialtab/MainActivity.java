package com.example.iwan_ni.materialtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.iwan_ni.materialtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        //inisialisasi tab dengan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter ke dalam ViewPager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Manipulasi sedikit untuk set TextColor pada Tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark), getResources().getColor(android.R.color.white));

        //set tab ke ViewPager
        tabs.setupWithViewPager(pager);

        //konfigurasu Gravity Fill untuk Tab berada di posisi yang proporsional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
