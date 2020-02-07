package com.example.vitamin.vitaminDietary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.AdapterVitamin.AdapterB2;

public class DietaryD extends AppCompatActivity {
    private RecyclerView recyclerView_D;
    private RecyclerView.LayoutManager layoutManager_D;
    private RecyclerView.Adapter adapter_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_d);

        recyclerView_D = findViewById(R.id.rv_DietaryC);
        recyclerView_D.setHasFixedSize(true);
        adapter_D = new AdapterB2();

        layoutManager_D = new LinearLayoutManager(this);
        recyclerView_D.setLayoutManager(layoutManager_D);

        recyclerView_D.setAdapter(adapter_D);



    }
}
