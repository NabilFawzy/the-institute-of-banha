package com.example.nabil.theinstituteofus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class departments extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        pdfView=(PDFView)findViewById(R.id.pdfviewdept);
        pdfView.fromAsset("departs.pdf").load();
    }
}
