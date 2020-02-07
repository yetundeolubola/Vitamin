package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterD;

public class vitaminD extends AppCompatActivity {
    private RecyclerView recyclerView_D;
    private RecyclerView.Adapter adapter_D;
    private RecyclerView.LayoutManager layoutManager_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_d);

        recyclerView_D = findViewById(R.id.rv_D);
        recyclerView_D.setHasFixedSize(true);

        adapter_D = new AdapterD();

        layoutManager_D = new LinearLayoutManager(this);
        recyclerView_D.setLayoutManager(layoutManager_D);

        recyclerView_D.setAdapter(adapter_D);
    }
}
