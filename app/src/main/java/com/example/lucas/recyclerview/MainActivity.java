package com.example.lucas.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Companie> companiesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RVAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rvCompanies);

        mAdapter = new RVAdapter(companiesList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {

            @Override
            public void onClick(View view, int position) {
                Companie movie = companiesList.get(position);
                Toast.makeText(getApplicationContext(), movie.getName()+ " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareCompanieData();
    }

    private void prepareCompanieData() {

        Companie companie = new Companie(R.drawable.bretas, "Bretas", "Aberto até às 21:00", "5 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.carrefour, "Carrefour", "Aberto até às 19:00", "3,2 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.tatico, "Tatico", "Aberto até às 20:00", "3,8 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.guanabara, "Guanabara", "Aberto até às 21:00", "4 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.bh, "BH", "Aberto até às 21:00", "6 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.amaral, "Amaral", "Aberto até às 20:00", "2 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.saoluiz, "São Luiz", "Aberto até às 22:00", "3,8 km daqui");
        companiesList.add(companie);

        companie = new Companie(R.drawable.lisboa, "Lisboa", "Aberto até às 19:00", "1,8 km daqui");
        companiesList.add(companie);

        mAdapter.notifyDataSetChanged();
    }
}