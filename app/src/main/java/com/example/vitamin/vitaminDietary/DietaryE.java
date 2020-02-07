package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryE extends AppCompatActivity {
    private RecyclerView recyclerView_E;
    private RecyclerView.LayoutManager layoutManager_E;
    private RecyclerView.Adapter adapter_E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_e);

        recyclerView_E = findViewById(R.id.rv_DietaryE);
        recyclerView_E.setHasFixedSize(true);
        adapter_E = new AdapterB2();

        layoutManager_E = new LinearLayoutManager(this);
        recyclerView_E.setLayoutManager(layoutManager_E);

        recyclerView_E.setAdapter(adapter_E);
    }
}
