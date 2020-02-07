package com.example.vitamin.Activity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB;

public class vitaminB extends AppCompatActivity {
    private RecyclerView recyclerView_B;
    private RecyclerView.Adapter adapter_B;
    private RecyclerView.LayoutManager layoutManager_B;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        recyclerView_B = findViewById(R.id.rv_B);
        adapter_B = new AdapterB();
        recyclerView_B.setHasFixedSize(true);

        layoutManager_B = new LinearLayoutManager(this);
        recyclerView_B.setLayoutManager(layoutManager_B);

        recyclerView_B.setAdapter(adapter_B);

    }
}
