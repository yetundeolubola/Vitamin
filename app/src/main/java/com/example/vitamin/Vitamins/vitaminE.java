package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterD;

public class vitaminE extends AppCompatActivity {
    private RecyclerView recyclerView_E;
    private RecyclerView.Adapter adapter_E;
    private RecyclerView.LayoutManager layoutManager_E;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_e);

        recyclerView_E = findViewById(R.id.rv_E);
        recyclerView_E.setHasFixedSize(true);

        adapter_E = new AdapterD();

        layoutManager_E = new LinearLayoutManager(this);
        recyclerView_E.setLayoutManager(layoutManager_E);

        recyclerView_E.setAdapter(adapter_E);
    }
}
