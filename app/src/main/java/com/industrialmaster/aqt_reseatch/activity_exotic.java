package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_exotic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exotic);
    }
    public void onEndemic (View view){
        Intent intent = new Intent(activity_exotic.this,activity_endemic.class);
        startActivity(intent);
    }

    public void onEchinodorus (View view){
        Intent intent = new Intent(activity_exotic.this,activity_echinodorus.class);
        startActivity(intent);
    }

    public void onAnubias (View view){
        Intent intent = new Intent(activity_exotic.this,activity_anubias.class);
        startActivity(intent);
    }

    public void onStat (View view){
        Intent intent = new Intent(activity_exotic.this,activity_stats.class);
        startActivity(intent);
    }
}
