package com.aztechlabs.ceniflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BureauVote extends AppCompatActivity {
    ImageView searchButton;
    LinearLayout results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bureau_vote);
        
        searchButton = findViewById(R.id.searchbutton);
        results = findViewById(R.id.results);
        results.setVisibility(View.GONE);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (results.getVisibility() == View.VISIBLE){
                    results.setVisibility(View.GONE);
                }else {
                    results.setVisibility(View.VISIBLE);
                }
            }
        });
        ImageView goBack = findViewById(R.id.goBack);
    
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BureauVote.this, MainActivity.class));
            }
        });
    }
}