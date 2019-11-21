package com.example.hostelworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hostelworld.adapters.hostelsViewAdapter;
import com.example.hostelworld.adapters.reviews_adapter;

public class Hostelite_review_page extends AppCompatActivity {
    RecyclerView rvReviews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostelite_review_page);

        rvReviews=findViewById(R.id.rv_reviews);
        rvReviews.setLayoutManager(new LinearLayoutManager(this));

        reviews_adapter adapter =new reviews_adapter(this);
        rvReviews.setAdapter(adapter);
    }
}
