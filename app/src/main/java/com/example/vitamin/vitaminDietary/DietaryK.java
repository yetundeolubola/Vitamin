package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryK extends AppCompatActivity {
    private RecyclerView recyclerView_K;
    private RecyclerView.LayoutManager layoutManager_K;
    private RecyclerView.Adapter adapter_K;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_k);

        recyclerView_K = findViewById(R.id.rv_DietaryK);
        recyclerView_K.setHasFixedSize(true);
        adapter_K = new AdapterB2();

        layoutManager_K = new LinearLayoutManager(this);
        recyclerView_K.setLayoutManager(layoutManager_K);

        recyclerView_K.setAdapter(adapter_K);
    }
}
