package com.example.vitamin.Vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB5;

public class vitaminB5 extends AppCompatActivity {

    private RecyclerView recycler_B5;
    private RecyclerView.Adapter adapter_B5;
    private RecyclerView.LayoutManager layoutManager_B5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_b5);

        recycler_B5 = findViewById(R.id.rv_B5);
        adapter_B5 = new AdapterB5();
        recycler_B5.setHasFixedSize(true);

        layoutManager_B5 = new LinearLayoutManager(this);
        recycler_B5.setLayoutManager(layoutManager_B5);

        recycler_B5.setAdapter(adapter_B5);



    }
}
