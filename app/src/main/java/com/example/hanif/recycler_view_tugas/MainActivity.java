package com.example.hanif.recycler_view_tugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> listNamaKota = new ArrayList<>();
    private KotaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new KotaAdapter(this, listNamaKota);
        listNamaKota.add("bandung");
        listNamaKota.add("jakarta");
        listNamaKota.add("bekasi");
        listNamaKota.add("Lamongan");
        listNamaKota.add("suroboyo");
        listNamaKota.add("Gresik");

        RecyclerView recyclerView = findViewById(R.id.list_kota);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
