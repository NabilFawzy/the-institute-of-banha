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

public class roundinstitut extends AppCompatActivity {
    ListView lvitems;
    String[] mylist1,mylist2,mylist3, mylist4,mylist5,mylist6,mylist7,mylist8,mylist9,mylist10;
    ArrayAdapter<String> arrayAdapter;
    public ArrayList<String> arrayList=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundinstitut);
        lvitems=(ListView)findViewById(R.id.Lisbvmostgadee) ;
        mylist1=getResources().getStringArray(R.array.nashaat);
        mylist2=getResources().getStringArray(R.array.roayaa);
        mylist3=getResources().getStringArray(R.array.darasakam);
        mylist4=getResources().getStringArray(R.array.wehdaalagyia);
        mylist5=getResources().getStringArray(R.array.adaretinstit);
        mylist6=getResources().getStringArray(R.array.ethadtalba);
        mylist7=getResources().getStringArray(R.array.departmentswservices);
                mylist8=getResources().getStringArray(R.array.takafol);
        mylist9=getResources().getStringArray(R.array.nzamexams);
        mylist10=getResources().getStringArray(R.array.surmokafa);
        final Spinner catspin=(Spinner)findViewById(R.id.mostgdspinneree);
        catspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(catspin.getSelectedItem().toString().equals("نشأه المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist1));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    lvitems.setAdapter(arrayAdapter);
                }
                else if(catspin.getSelectedItem().toString().equals("رؤية المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist2));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("مدة الدراسة بالمعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist3));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("الوحدة العلاجية")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist4));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("ادارة المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist5));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("اتحاد الطلاب")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist6));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("اقسام وخدمات المعهد")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist7));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("التكافل الاجتماعى")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist8));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("نظام الامتحانات")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist9));
                    arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
                    if(lvitems!=null){
                        lvitems.setAdapter(arrayAdapter);}
                }
                else if(catspin.getSelectedItem().toString().equals("مكأفات التفوق")){
                    arrayList=new ArrayList<String>(Arrays.asList(mylist10));
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
