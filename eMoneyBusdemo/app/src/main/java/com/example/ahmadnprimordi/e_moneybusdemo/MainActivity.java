package com.example.ahmadnprimordi.e_moneybusdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmadnprimordi.e_moneybusdemo.Fragment.AccountFragment;
import com.example.ahmadnprimordi.e_moneybusdemo.Fragment.AdviceFragment;
import com.example.ahmadnprimordi.e_moneybusdemo.Fragment.HistoryFragment;
import com.example.ahmadnprimordi.e_moneybusdemo.Fragment.MapsFragment;
import com.example.ahmadnprimordi.e_moneybusdemo.Fragment.PriceFragment;

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

        viewPagerAdapter.AddFragment(new MapsFragment(), "Peta");
        viewPagerAdapter.AddFragment(new PriceFragment(),"Harga");
        viewPagerAdapter.AddFragment(new HistoryFragment(),"Riwayat");
        viewPagerAdapter.AddFragment(new AccountFragment(), "Akun");
        viewPagerAdapter.AddFragment(new AdviceFragment(),"Saran");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(android.R.drawable.ic_dialog_map);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.ic_menu_today);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.ic_menu_rotate);
        tabLayout.getTabAt(3).setIcon(android.R.drawable.ic_menu_manage);
        tabLayout.getTabAt(4).setIcon(android.R.drawable.ic_btn_speak_now);
    }
}
