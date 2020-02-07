package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterC;

public class vitaminC extends AppCompatActivity {
    private RecyclerView recyclerView_C;
    private RecyclerView.Adapter adapter_C;
    private RecyclerView.LayoutManager layoutManager_C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_c);

        recyclerView_C = findViewById(R.id.rv_C);
        recyclerView_C.setHasFixedSize(true);

        adapter_C = new AdapterC();

        layoutManager_C = new LinearLayoutManager(this);
        recyclerView_C.setLayoutManager(layoutManager_C);

        recyclerView_C.setAdapter(adapter_C);
    }
}
