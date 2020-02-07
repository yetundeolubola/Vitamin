package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryB7 extends AppCompatActivity {
    private RecyclerView recyclerView_B7;
    private RecyclerView.LayoutManager layoutManager_B7;
    private RecyclerView.Adapter adapter_B7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_b7);

        recyclerView_B7 = findViewById(R.id.rv_DietaryB7);
        recyclerView_B7.setHasFixedSize(true);
        adapter_B7 = new AdapterB2();

        layoutManager_B7 = new LinearLayoutManager(this);
        recyclerView_B7.setLayoutManager(layoutManager_B7);

        recyclerView_B7.setAdapter(adapter_B7);
    }
}
