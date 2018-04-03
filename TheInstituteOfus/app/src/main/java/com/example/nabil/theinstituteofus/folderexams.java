package com.example.nabil.theinstituteofus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;

public class folderexams extends AppCompatActivity {
    GridView gridView;
    int feraa=1;
    String []values;
    Spinner spinner;
    int[] imagesawla={R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm};
    int[] imagestanya={R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm,R.drawable.mmm};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folderexams);
        gridView=(GridView)findViewById(R.id.gridview);
        spinner=(Spinner)findViewById(R.id.spinnerferaa);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spinner.getSelectedItem().toString().equals("الفرقة الاولى")){
                    feraa=1;
                    values=getResources().getStringArray(R.array.awlaexams);
                    GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),values,imagesawla);
                    gridView.setAdapter(gridAdapter);
                }
                else if(spinner.getSelectedItem().toString().equals("الفرقة الثانية")){
                    feraa=2;
                    values=getResources().getStringArray(R.array.tanyiaexams);
                    GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),values,imagestanya);
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
                   Intent i = new Intent(folderexams.this, mypdfviewer.class);
                   i.putExtra("feraa",feraa);
                   i.putExtra("index",position);
                   startActivity(i);
           }
       });
    }

}
