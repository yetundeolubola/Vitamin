package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB9;

public class vitaminB9 extends AppCompatActivity {
   private RecyclerView recyclerView_B9;
   private RecyclerView.Adapter adapter_B9;
   private RecyclerView.LayoutManager layoutManager_B9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b9);

        recyclerView_B9 = findViewById(R.id.rv_B9);
        recyclerView_B9.setHasFixedSize(true);

        adapter_B9 = new AdapterB9();

        layoutManager_B9 =new LinearLayoutManager(this);
        recyclerView_B9.setLayoutManager(layoutManager_B9);

        recyclerView_B9.setAdapter(adapter_B9);
    }
}
