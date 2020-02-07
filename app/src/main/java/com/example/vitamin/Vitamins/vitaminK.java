package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterD;

public class vitaminK extends AppCompatActivity {
    private RecyclerView recyclerView_K;
    private RecyclerView.Adapter adapter_K;
    private RecyclerView.LayoutManager layoutManager_K;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_k);

        recyclerView_K = findViewById(R.id.rv_E);
        recyclerView_K.setHasFixedSize(true);

        adapter_K = new AdapterD();

        layoutManager_K = new LinearLayoutManager(this);
        recyclerView_K.setLayoutManager(layoutManager_K);

        recyclerView_K.setAdapter(adapter_K);
    }
}
