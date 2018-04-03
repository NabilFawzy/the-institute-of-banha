package com.example.nabil.theinstituteofus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mypdfviewer extends AppCompatActivity {
PDFView pdfView;
    int feraaa;
    int indexz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypdfviewer);
        pdfView=(PDFView)findViewById(R.id.pdfview);
         feraaa=getIntent().getExtras().getInt("feraa");
         indexz=getIntent().getExtras().getInt("index");
         if (feraaa == 1) {
             if (indexz == 0) {
                 pdfView.fromAsset("principlestemp.pdf").load();
             } else if (indexz == 1) {
                 pdfView.fromAsset("asashedro.pdf").load();
             } else if (indexz == 2) {
                 pdfView.fromAsset("techkhraba.pdf").load();
             } else if (indexz == 3) {
                 pdfView.fromAsset("techelect.pdf").load();
             } else if (indexz == 4) {
                 pdfView.fromAsset("techmecha.pdf").load();
             } else if (indexz == 5) {
                 pdfView.fromAsset("techinfo.pdf").load();
             } else if (indexz == 6) {
                 pdfView.fromAsset("techcars.pdf").load();
             } else if (indexz == 7) {
                 pdfView.fromAsset("drawingEng.pdf").load();
             } else if (indexz == 8) {
                 pdfView.fromAsset("maths.pdf").load();
             } else if (indexz == 9) {
                 pdfView.fromAsset("salama.pdf").load();
             } else if (indexz == 10) {
                 pdfView.fromAsset("physics.pdf").load();
             } else if (indexz == 11) {
                 pdfView.fromAsset("english.pdf").load();
             } else if (indexz == 12) {
                 pdfView.fromAsset("handasakahraba.pdf").load();
             }


         } else if (feraaa == 2) {
             if (indexz == 0) {
                 pdfView.fromAsset("aghzatania.pdf").load();
             } else if (indexz == 1) {
                 pdfView.fromAsset("tabredtania.pdf").load();
             } else if (indexz == 2) {
                 pdfView.fromAsset("sayarattania.pdf").load();
             } else if (indexz == 3) {
                 pdfView.fromAsset("shabakattania.pdf").load();
             } else if (indexz == 4) {
                 pdfView.fromAsset("alaaaattania.pdf").load();
             }
         }
     }


}
