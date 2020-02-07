package com.example.vitamin.Vitamins;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB6;

public class vitaminB6 extends AppCompatActivity {
    private RecyclerView recycler_B6;
    private RecyclerView.LayoutManager layoutManager_B6;
    private RecyclerView.Adapter adapter_B6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b6);

       recycler_B6 = findViewById(R.id.rv_B6);
       adapter_B6 = new AdapterB6();
       recycler_B6.setHasFixedSize(true);

       layoutManager_B6 = new LinearLayoutManager(this);
       recycler_B6.setLayoutManager(layoutManager_B6);

       recycler_B6.setAdapter(adapter_B6);
    }
}
