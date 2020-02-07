package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB12;

public class vitaminB12 extends AppCompatActivity {
   private RecyclerView recyclerView_B12;
   private RecyclerView.Adapter adapter_B12;
   private RecyclerView.LayoutManager layoutManager_B12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b12);

        recyclerView_B12 = findViewById(R.id.rv_B12);
        recyclerView_B12.setHasFixedSize(true);
        adapter_B12 = new AdapterB12();

        layoutManager_B12 = new LinearLayoutManager(this);
        recyclerView_B12.setLayoutManager(layoutManager_B12);

        recyclerView_B12.setAdapter(adapter_B12);
    }
}
