package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_anubias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anubias);
    }

    public void onberter (View view){
        Intent intent = new Intent(activity_anubias.this,activity_anubias_berter.class);
        startActivity(intent);
    }
}
