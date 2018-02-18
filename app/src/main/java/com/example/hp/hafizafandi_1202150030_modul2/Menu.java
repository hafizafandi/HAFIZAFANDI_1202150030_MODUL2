package com.example.hp.hafizafandi_1202150030_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("hafgant");
            foods.add("baso");
            foods.add("burger");
            foods.add("ikanbakar");
            foods.add("kebab");
            foods.add("miegoreng");
            foods.add("pisangnuget");
            foods.add("sosis");
            foods.add("soto");

            // mamanggil harga
            priceses.add(150000);
            priceses.add(20000);
            priceses.add(40000);
            priceses.add(35000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(30000);
            priceses.add(20000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.hafgant);
            photos.add(R.drawable.baso);
            photos.add(R.drawable.burger);
            photos.add(R.drawable.ikanbakar);
            photos.add(R.drawable.kebab);
            photos.add(R.drawable.miegoreng);
            photos.add(R.drawable.pisangnuget);
            photos.add(R.drawable.sosis);
            photos.add(R.drawable.soto);
        }
    }