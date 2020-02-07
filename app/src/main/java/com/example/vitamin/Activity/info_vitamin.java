package com.example.vitamin.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.vitamin.R;

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
        rAdapter = new MyAadpter();

        recyclerView.setHasFixedSize(true);

        rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);

        recyclerView.setAdapter(rAdapter);

//        ActionBar actionbar = getActionBar();
//        actionbar.setDisplayHomeAsUpEnabled(true);


    }

//     public boolean onOptionsItemSelected(MenuItem item){
//        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
//        startActivityForResult(myIntent, 0);
//        finish();
//         return true;
//    }



    }

