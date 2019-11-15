package com.example.hostelworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hostelworld.adapters.hostelsViewAdapter;

public class HosteliteLAndingPage extends AppCompatActivity {

    RecyclerView rvHostels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostelite_landing_page);

        rvHostels=findViewById(R.id.rv_hostels_lp);
        rvHostels.setLayoutManager(new LinearLayoutManager(this));

        hostelsViewAdapter adapter =new hostelsViewAdapter(this);
        rvHostels.setAdapter(adapter);

    }
}
