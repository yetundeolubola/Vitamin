package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB7;

public class vitaminB7 extends AppCompatActivity {
    private RecyclerView recyclerViewB7;
    private RecyclerView.Adapter adapterB7;
    private RecyclerView.LayoutManager layoutManagerB7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b7);

        recyclerViewB7 = findViewById(R.id.rv_B7);
        recyclerViewB7.setHasFixedSize(true);

        adapterB7 = new AdapterB7();

        layoutManagerB7 = new LinearLayoutManager(this);
        recyclerViewB7.setLayoutManager(layoutManagerB7);
        recyclerViewB7.setAdapter(adapterB7);
    }
}
