package com.aztechlabs.ceniflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.animation);
        lottieAnimationView.setAnimation("data.json");
        lottieAnimationView.loop(false); lottieAnimationView.playAnimation();
    
        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                
            
            }
        }, 6500);
    }
}