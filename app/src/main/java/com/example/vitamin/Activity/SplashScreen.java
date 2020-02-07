package com.example.vitamin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.vitamin.R;

public class SplashScreen extends AppCompatActivity {
    private static int timer = 5000;
    private TextView tx_vitamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tx_vitamin = findViewById(R.id.textView4);
        Animation myaim = AnimationUtils.loadAnimation(this,R.anim.asplah);
        tx_vitamin.startAnimation(myaim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },timer);
    }
}
