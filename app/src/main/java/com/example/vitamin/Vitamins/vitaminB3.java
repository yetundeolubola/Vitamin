package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB3;

public class vitaminB3 extends AppCompatActivity {

    private RecyclerView recyclerB3;
    private RecyclerView.Adapter adapter_B3;
    private RecyclerView.LayoutManager layoutManager_B3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b3);


        recyclerB3 = findViewById(R.id.rv_B3);

        adapter_B3 = new AdapterB3();
        recyclerB3.setHasFixedSize(true);

        layoutManager_B3 = new LinearLayoutManager(this);
        recyclerB3.setLayoutManager(layoutManager_B3);

        recyclerB3.setAdapter(adapter_B3);


    }
}
