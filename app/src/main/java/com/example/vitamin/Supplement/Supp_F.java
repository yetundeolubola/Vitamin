package com.example.vitamin.Supplement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vitamin.R;

import Adapter.MyAadpter;

public class Supp_F extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager rLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supp__f);

        recyclerView = findViewById(R.id.rv_SuppF);
        rAdapter = new MyAadpter();

        recyclerView.setHasFixedSize(true);

        rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);

        recyclerView.setAdapter(rAdapter);

    }
}
