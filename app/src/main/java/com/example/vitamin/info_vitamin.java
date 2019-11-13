package com.example.vitamin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Adapter.MyAadpter;

public class info_vitamin extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager rLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_vitamin);

        recyclerView = findViewById(R.id.rv_vitamin);

        rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);

        rAdapter = new MyAadpter();
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(rAdapter);

    }
}
