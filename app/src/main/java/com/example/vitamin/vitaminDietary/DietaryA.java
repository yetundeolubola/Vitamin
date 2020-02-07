package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryA extends AppCompatActivity {
    private RecyclerView recyclerView_dA;
    private RecyclerView.LayoutManager layoutManager_dA;
    private RecyclerView.Adapter adapter_dA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary);

        recyclerView_dA = findViewById(R.id.rv_dietaryA);
        recyclerView_dA.setHasFixedSize(true);
        adapter_dA = new AdapterB2();

        layoutManager_dA = new LinearLayoutManager(this);
        recyclerView_dA.setLayoutManager(layoutManager_dA);

        recyclerView_dA.setAdapter(adapter_dA);
    }

    }

