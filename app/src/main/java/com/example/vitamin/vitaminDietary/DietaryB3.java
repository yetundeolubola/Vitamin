package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryB3 extends AppCompatActivity {
    private RecyclerView recyclerView_B3;
    private RecyclerView.LayoutManager layoutManager_B3;
    private RecyclerView.Adapter adapter_B3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_b3);

        recyclerView_B3 = findViewById(R.id.rv_DietaryB3);
        recyclerView_B3.setHasFixedSize(true);
        adapter_B3 = new AdapterB2();

        layoutManager_B3 = new LinearLayoutManager(this);
        recyclerView_B3.setLayoutManager(layoutManager_B3);

        recyclerView_B3.setAdapter(adapter_B3);
    }
}
