package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterD;

public class vitaminF extends AppCompatActivity {
    private RecyclerView recyclerView_F;
    private RecyclerView.Adapter adapter_F;
    private RecyclerView.LayoutManager layoutManager_F;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_f);

        recyclerView_F = findViewById(R.id.rv_E);
        recyclerView_F.setHasFixedSize(true);

        adapter_F = new AdapterD();

        layoutManager_F = new LinearLayoutManager(this);
        recyclerView_F.setLayoutManager(layoutManager_F);

        recyclerView_F.setAdapter(adapter_F);
    }
}
