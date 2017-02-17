package com.example.prasanth.viewpagerproject.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.prasanth.viewpagerproject.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> imagesList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagesList.add(R.drawable.pra);
        imagesList.add(R.drawable.srinivas);
        imagesList.add(R.drawable.raj);
        imagesList.add(R.drawable.venk);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        PagerAdapterActivity pagerAdapterActivity = new PagerAdapterActivity(this, imagesList);
        viewPager.setAdapter(pagerAdapterActivity);
    }
}
