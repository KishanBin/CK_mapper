package com.example.ck_mapper;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck_mapper.adapter.CustomBtnAdapter;
import com.example.ck_mapper.models.Custom_btn_model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Custom_btn_model> btnsList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        btnsList = new ArrayList<>();

        btnsList.add(new Custom_btn_model(R.drawable.directional_btn,"Up",270f));
        btnsList.add(new Custom_btn_model(R.drawable.directional_btn,"Right",0f));
        btnsList.add(new Custom_btn_model(R.drawable.directional_btn,"Down",90f));
        btnsList.add(new Custom_btn_model(R.drawable.directional_btn,"Left",180f));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomBtnAdapter custom_btn_adapter = new CustomBtnAdapter(this,btnsList);

        recyclerView.setAdapter(custom_btn_adapter);

    }
}