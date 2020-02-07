package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryC extends AppCompatActivity {
    private RecyclerView recyclerView_C;
    private RecyclerView.LayoutManager layoutManager_C;
    private RecyclerView.Adapter adapter_C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_c);

        recyclerView_C = findViewById(R.id.rv_DietaryC);
        recyclerView_C.setHasFixedSize(true);
        adapter_C = new AdapterB2();

        layoutManager_C = new LinearLayoutManager(this);
        recyclerView_C.setLayoutManager(layoutManager_C);

        recyclerView_C.setAdapter(adapter_C);
    }
}
