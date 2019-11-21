package com.example.hostelworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.hostelworld.adapters.viewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
    //AbdulRehman
public class HosteliteProfile extends AppCompatActivity {

    TabLayout tabLayout ;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostelite_profile);

        tabLayout=findViewById(R.id.tabs_layout_hostelite_profile);
        viewPager=findViewById(R.id.viewpager_hostelite_profile);

        viewPagerAdapter adapter= new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragment_hostelite_myHostel(), "About");
        adapter.addFragment(new fragment_hostelite_myHostel(), "My Hostel");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
