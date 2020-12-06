package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_echinodorus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echinodorus);
    }

    public void oncordifolius (View view){
        Intent intent = new Intent(activity_echinodorus.this,activity_echinodorus_cordifolius.class);
        startActivity(intent);
    }
}
