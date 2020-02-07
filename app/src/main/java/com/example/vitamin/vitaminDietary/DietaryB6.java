package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryB6 extends AppCompatActivity {
    private RecyclerView recyclerView_B6;
    private RecyclerView.LayoutManager layoutManager_B6;
    private RecyclerView.Adapter adapter_B6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_b6);

        recyclerView_B6 = findViewById(R.id.rv_DietaryB6);
        recyclerView_B6.setHasFixedSize(true);
        adapter_B6 = new AdapterB2();

        layoutManager_B6 = new LinearLayoutManager(this);
        recyclerView_B6.setLayoutManager(layoutManager_B6);

        recyclerView_B6.setAdapter(adapter_B6);
    }
}
