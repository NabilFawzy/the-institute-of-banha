package com.example.nabil.theinstituteofus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class round extends AppCompatActivity {

    ListView lvitems;
    String[] mylist1,mylist2,mylist3, mylist4,mylist5,mylist6,mylist7;
    ArrayAdapter<String> arrayAdapter;
    public ArrayList<String> arrayList=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);
        lvitems=(ListView)findViewById(R.id.Lisbvmostgad) ;
         mylist1=getResources().getStringArray(R.array.adivicesstrings);
        mylist2=getResources().getStringArray(R.array.aims);
                mylist3=getResources().getStringArray(R.array.papersneed);
        mylist4=getResources().getStringArray(R.array.roadtoinstit);
        mylist5=getResources().getStringArray(R.array.punishment);
        mylist6=getResources().getStringArray(R.array.shoulddone);
        mylist7=getResources().getStringArray(R.array.recepent);
        final Spinner catspin=(Spinner)findViewById(R.id.mostgdspinner);

        catspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(catspin.getSelectedItem().toString().equals("أرشادات هامة")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist1));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                        lvitems.setAdapter(arrayAdapter);
                }
                else if(catspin.getSelectedItem().toString().equals("أهداف المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist2));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("الاوراق المطلوبة للمستجدين")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist3));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("الطريق الى المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist4));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("العقوبات فى حالة الغش")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist5));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("الواجبات المطلوبة اثناء الامتحانات")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist6));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("ألية أستقبال الطلاب الجدد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist7));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
