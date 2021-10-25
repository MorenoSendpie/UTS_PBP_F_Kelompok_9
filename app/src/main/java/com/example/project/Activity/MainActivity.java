package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.project.Adapter.MenuAdapter;
import com.example.project.Domain.SushiDomain;
import com.example.project.R;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter2;
    private RecyclerView recyclerViewMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMenu();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout profilBtn = findViewById(R.id.profilBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);

        profilBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfilActivity.class));
            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    private void recyclerViewMenu() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMenuList = findViewById(R.id.recyclerView2);
        recyclerViewMenuList.setLayoutManager(linearLayoutManager);

        ArrayList<SushiDomain> foodlist = new ArrayList<>();
        foodlist.add(new SushiDomain("California Roll", "california", "California Roll adalah sushi berisi Ketimun, Kepiting dan Alpukat", 10000));
        foodlist.add(new SushiDomain("Fish Cake Roll", "fishcake", "Fish Cake Roll adalah sushi berbahan dasar ikan dengan sedikit sayur", 11000));
        foodlist.add(new SushiDomain("Katsu Roll", "katsu", "Katsu Roll adalah sushi berbahan dasar ayam dengan sedikit sayur", 12000));
        foodlist.add(new SushiDomain("Tempura Roll", "tempura", "Tempura Roll adalah sushi berbahan dasar udang dengan sedikit sayur", 10500));

        adapter2 = new MenuAdapter(foodlist);
        recyclerViewMenuList.setAdapter(adapter2);

    }


}