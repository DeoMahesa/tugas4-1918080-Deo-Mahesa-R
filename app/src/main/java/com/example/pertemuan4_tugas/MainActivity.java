package com.example.pertemuan4_tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MainanAdapter adapter;
    private ArrayList<Mainan> mainanArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new MainanAdapter(mainanArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mainanArrayList = new ArrayList<>();
        mainanArrayList.add(new Mainan("Mainan", "Beruang", "Tahun 2021",R.drawable.bear));
        mainanArrayList.add(new Mainan("Mainan", "Mobil", "Tahun 2021",R.drawable.mobil));
        mainanArrayList.add(new Mainan("Mainan", "Robot", "Tahun 2021",R.drawable.robot));
    }
}