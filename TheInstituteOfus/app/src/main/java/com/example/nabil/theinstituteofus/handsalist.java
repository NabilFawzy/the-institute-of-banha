

package com.example.nabil.theinstituteofus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class handsalist extends AppCompatActivity {
    ArrayList<theitem> itemData=new ArrayList<theitem>();
    ArrayList<theitem> itemDatabuf1=new ArrayList<theitem>();
    ArrayList<theitem> itemDatabuf2=new ArrayList<theitem>();
    String[] engnamesnzri;
    String[] engnamesamli;

    theitemAdapter itemsAdapter=null;
    ListView lvitems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handsalist);
        final Spinner catspin=(Spinner)findViewById(R.id.spCategory);
        lvitems=(ListView)findViewById(R.id.ListViewProducts);
        engnamesnzri=getResources().getStringArray(R.array.engsNames);
        engnamesamli=getResources().getStringArray(R.array.engsNameslab);
        for(int i=0;i<engnamesnzri.length-5;i++){
            char x=(char)('a'+i);
            theitem itm=new theitem(engnamesnzri[i],"aa"+x);
           // theitem itm=new theitem(engnamesnzri[i],"aaa");
            itemData.add(itm);
            itemDatabuf1.add(itm);

        }
        for(int i=engnamesnzri.length-5;i<engnamesnzri.length;i++){
            int d=i-26;
            char x=(char)('a'+d);
            theitem itm=new theitem(engnamesnzri[i],"g"+x);
            //theitem itm=new theitem(engnamesnzri[i],"r1");
            itemData.add(itm);
            itemDatabuf1.add(itm);

        }
        for(int i=0;i<engnamesamli.length;i++){
            char x=(char)('a'+i);
           theitem itm=new theitem(engnamesamli[i],"aaaa"+x);
           // theitem itm=new theitem(engnamesnzri[i],"aaa");
            itemData.add(itm);
            itemDatabuf2.add(itm);
        }

        itemsAdapter=new theitemAdapter(getApplicationContext(),R.layout.activity_row,itemData);
            lvitems.setAdapter(itemsAdapter);

        catspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(catspin.getSelectedItem().toString().equals("الكل")){
                    itemsAdapter=new theitemAdapter(getApplicationContext(),R.layout.activity_row,itemData);
                    if(lvitems!=null){
                        lvitems.setAdapter(itemsAdapter);}
                }
                else  if(catspin.getSelectedItem().toString().equals("هيئة التدريس النظرى")){
                    itemsAdapter=new theitemAdapter(getApplicationContext(),R.layout.activity_row,itemDatabuf1);
                    if(lvitems!=null){
                        lvitems.setAdapter(itemsAdapter);}
                }
                else  if(catspin.getSelectedItem().toString().equals("هيئة التدريس العملى")){
                    itemsAdapter=new theitemAdapter(getApplicationContext(),R.layout.activity_row,itemDatabuf2);
                    if(lvitems!=null){
                        lvitems.setAdapter(itemsAdapter);}
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

