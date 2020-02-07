package com.example.vitamin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vitamin.Activity.info_vitamin;
import com.example.vitamin.R;


public class MainActivity extends AppCompatActivity {
   Button Vitaminfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vitaminfo = findViewById(R.id.vitamininfo);

        Vitaminfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), info_vitamin.class));
                finish();
            }
        });

    }
}
