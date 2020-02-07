package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryB2 extends AppCompatActivity {
    private RecyclerView recyclerView_b2;
    private RecyclerView.LayoutManager layoutManager_b2;
    private RecyclerView.Adapter adapter_B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_b2);

        recyclerView_b2 = findViewById(R.id.rv_DietaryB2);
        recyclerView_b2.setHasFixedSize(true);
        adapter_B2 = new AdapterB2();

        layoutManager_b2 = new LinearLayoutManager(this);
        recyclerView_b2.setLayoutManager(layoutManager_b2);

        recyclerView_b2.setAdapter(adapter_B2);
    }
}
