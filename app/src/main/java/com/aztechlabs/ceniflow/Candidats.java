package com.aztechlabs.ceniflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class Candidats extends AppCompatActivity {
    List<Integer> images= new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidats);
        
        
        initData();
        HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =(HorizontalInfiniteCycleViewPager)findViewById(R.id.viewPager);
        CandidatPagerAdapter myAdopter = new CandidatPagerAdapter(images,getBaseContext());
        horizontalInfiniteCycleViewPager.setAdapter(myAdopter);
    
        ImageView goBack = findViewById(R.id.goBack);
    
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Candidats.this, MainActivity.class));
            }
        });
    
        
    }
    private void initData() {
        images.add(R.drawable.imglogo);
        images.add(R.drawable.imglogo);
        images.add(R.drawable.imglogo);
        images.add(R.drawable.imglogo);
    }
    
}