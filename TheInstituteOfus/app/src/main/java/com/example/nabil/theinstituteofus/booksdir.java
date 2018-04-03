package com.example.nabil.theinstituteofus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;

public class booksdir extends AppCompatActivity {
    GridView gridView;
    String []values1;String []values2;
    Spinner spinner;
    int part=1;
    int[] imagesawla={R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,
            R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,
            R.drawable.mmm,R.drawable.mmm};
    int[] imagestania={R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,
            R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,
            R.drawable.mmm,R.drawable.mmm};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booksdir);
        gridView=(GridView)findViewById(R.id.gridviewbooks);
        spinner=(Spinner)findViewById(R.id.spinnerferaabook);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner.getSelectedItem().toString().equals("كتب1")){
                    values1=getResources().getStringArray(R.array.booksstuding1);
                    part=1;
                    GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),values1,imagesawla);
                    gridView.setAdapter(gridAdapter);
                }
                else if(spinner.getSelectedItem().toString().equals("كتب2")){
                    part=2;
                    values2=getResources().getStringArray(R.array.booksstuding2);
                    GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),values2,imagestania);
                    gridView.setAdapter(gridAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(booksdir.this, booksviewer.class);
                i.putExtra("part",part);
                i.putExtra("index",position);
                startActivity(i);
            }
        });

    }
}