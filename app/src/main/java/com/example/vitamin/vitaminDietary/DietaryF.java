package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryF extends AppCompatActivity {
    private RecyclerView recyclerView_F;
    private RecyclerView.LayoutManager layoutManager_F;
    private RecyclerView.Adapter adapter_F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_f);

        recyclerView_F = findViewById(R.id.rv_DietaryF);
        recyclerView_F.setHasFixedSize(true);
        adapter_F = new AdapterB2();

        layoutManager_F = new LinearLayoutManager(this);
        recyclerView_F.setLayoutManager(layoutManager_F);

        recyclerView_F.setAdapter(adapter_F);
    }
}
