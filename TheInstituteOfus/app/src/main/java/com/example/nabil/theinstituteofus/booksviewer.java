package com.example.nabil.theinstituteofus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class booksviewer extends AppCompatActivity {
    PDFView pdfView;
    int indexz;
    int part;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booksviewer);
        pdfView=(PDFView)findViewById(R.id.pdfviewbook);
        indexz=getIntent().getExtras().getInt("index");
        part=getIntent().getExtras().getInt("part");
        if(part==1){
            if (indexz == 0) {
                pdfView.fromAsset("ekhtbarbook.pdf").load();
            } else if (indexz == 1) {
                pdfView.fromAsset("addtbreedbook.pdf").load();
            } else if (indexz == 2) {
                pdfView.fromAsset("electsnaaibook.pdf").load();
            } else if (indexz == 3) {
                pdfView.fromAsset("tafadolbook.pdf").load();
            } else if (indexz == 4) {
                pdfView.fromAsset("takamolbook.pdf").load();
            } else if (indexz == 5) {
                pdfView.fromAsset("harakawnewtenbook.pdf").load();
            } else if (indexz == 6) {
                pdfView.fromAsset("dynamicaharariabook.pdf").load();
            } else if (indexz == 7) {
                pdfView.fromAsset("rsmfanibook.pdf").load();
            } else if (indexz == 8) {
                pdfView.fromAsset("shoalwrakabook.pdf").load();
            } else if (indexz == 9) {
                pdfView.fromAsset("anaserelectbook.pdf").load();
            } else if (indexz == 10) {
                pdfView.fromAsset("kyasatbook.pdf").load();
            } else if (indexz == 11) {
                pdfView.fromAsset("kmkyaskmmotghbook.pdf").load();
        }
          }
        else if(part==2){
            if (indexz == 0) {
                pdfView.fromAsset("tsmemelecbook.pdf").load();
            }else if (indexz == 1) {
                pdfView.fromAsset("hasebatwmoalgabook.pdf").load();
            } else if (indexz == 2) {
                pdfView.fromAsset("doaerelectbook.pdf").load();
            } else if (indexz == 3) {
                pdfView.fromAsset("doaerlogicbook.pdf").load();
            } else if (indexz == 4) {
                pdfView.fromAsset("syanahasebalibook.pdf").load();
            } else if (indexz == 5) {
                pdfView.fromAsset("kyasatwaghzabook.pdf").load();
            } else if (indexz == 6) {
                pdfView.fromAsset("mohrkatbook.pdf").load();
            } else if (indexz == 7) {
                pdfView.fromAsset("mashareaelectbook.pdf").load();
            } else if (indexz == 8) {
                pdfView.fromAsset("mokdeemabook.pdf").load();
            } else if (indexz == 9) {
                pdfView.fromAsset("mkonatdayrettabredbook.pdf").load();
            } else if (indexz == 10) {
                pdfView.fromAsset("handsakhrbaabook.pdf").load();
            } else if (indexz == 11) {
                pdfView.fromAsset("handasakhrababboook.pdf").load();
            }
        }


    }
}
