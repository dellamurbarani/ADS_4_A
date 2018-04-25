package com.example.ahmadnprimordi.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout_id);
        viewPager = findViewById(R.id.viewPager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.AddFragment(new AkunFragment(), "Akun");
        viewPagerAdapter.AddFragment(new HargaFragment(),"Harga");
        viewPagerAdapter.AddFragment(new HomeFragment(), "Home");
        viewPagerAdapter.AddFragment(new RiwayatFragment(),"Riwayat");
        viewPagerAdapter.AddFragment(new SaranFragment(),"Saran");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(android.R.drawable.ic_btn_speak_now);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.ic_btn_speak_now);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.ic_btn_speak_now);
        tabLayout.getTabAt(3).setIcon(android.R.drawable.ic_btn_speak_now);
        tabLayout.getTabAt(4).setIcon(android.R.drawable.ic_btn_speak_now);
    }
}
