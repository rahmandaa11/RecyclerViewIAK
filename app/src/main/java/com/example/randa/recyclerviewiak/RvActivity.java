package com.example.randa.recyclerviewiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RvActivity extends AppCompatActivity {
    RecyclerView rv;
    List<AnimalModel> animalList = new ArrayList<>();
    AnimalAdapter animalAdapter;
    AnimalModel animalModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);

        rv = (RecyclerView) findViewById(R.id.rv);

        animalAdapter = new AnimalAdapter(getApplicationContext(), animalList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(animalAdapter);
        persiapanData ();


    }

    private void tambahData (int gambar, String namaIndo, String namaEng){
        animalModel = new AnimalModel(namaIndo,namaEng,gambar);
        animalList.add(animalModel);

    }

    //persiapan data
    private void persiapanData (){
        tambahData(R.drawable.anbull,"Banteng","Bull");
        tambahData(R.drawable.anchick,"Ayama", "Chick");
        tambahData(R.drawable.ancrab,"Kepting","Crab");
        tambahData(R.drawable.anfox,"Serigala", "Fox");
        tambahData(R.drawable.anhedgehog,"Landak", "Hedgehog");


    }
}
