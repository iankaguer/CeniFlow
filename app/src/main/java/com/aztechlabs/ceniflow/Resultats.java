package com.aztechlabs.ceniflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class Resultats extends AppCompatActivity {
    
    List<Integer> images= new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats);
        
        
        initData();
        HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =(HorizontalInfiniteCycleViewPager)findViewById(R.id.viewPager);
        ResultatPagerAdapter myAdopter = new ResultatPagerAdapter(images,getBaseContext());
        horizontalInfiniteCycleViewPager.setAdapter(myAdopter);
    
        ImageView goBack = findViewById(R.id.goBack);
    
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resultats.this, MainActivity.class));
            }
        });
        
        
    }
    private void initData() {
        images.add(R.drawable.ic_support);
        images.add(R.drawable.ic_support);
        images.add(R.drawable.ic_support);
        images.add(R.drawable.ic_support);
    }
    
}