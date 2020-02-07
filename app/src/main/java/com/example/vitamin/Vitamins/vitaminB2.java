package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class vitaminB2 extends AppCompatActivity {

    private RecyclerView recyclerView_B2;
    private RecyclerView.LayoutManager layoutManager_B2;
    private RecyclerView.Adapter adapter_B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b2);

        recyclerView_B2 = findViewById(R.id.rv_B2);
        recyclerView_B2.setHasFixedSize(true);
        adapter_B2 = new AdapterB2();

        layoutManager_B2 = new LinearLayoutManager(this);
        recyclerView_B2.setLayoutManager(layoutManager_B2);

        recyclerView_B2.setAdapter(adapter_B2);
    }
}
