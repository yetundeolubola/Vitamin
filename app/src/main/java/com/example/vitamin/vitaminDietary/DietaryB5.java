package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryB5 extends AppCompatActivity {
    private RecyclerView recyclerView_B5;
    private RecyclerView.LayoutManager layoutManager_B5;
    private RecyclerView.Adapter adapter_B5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_b5);

        recyclerView_B5 = findViewById(R.id.rv_DietaryB5);
        recyclerView_B5.setHasFixedSize(true);
        adapter_B5 = new AdapterB2();

        layoutManager_B5 = new LinearLayoutManager(this);
        recyclerView_B5.setLayoutManager(layoutManager_B5);

        recyclerView_B5.setAdapter(adapter_B5);
    }
}
