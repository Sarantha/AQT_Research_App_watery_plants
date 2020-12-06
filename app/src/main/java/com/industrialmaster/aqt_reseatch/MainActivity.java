package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEndemic (View view){
        Intent intent = new Intent(MainActivity.this,activity_endemic.class);
        startActivity(intent);
    }
    public void onExotic (View view){
        Intent intent = new Intent(MainActivity.this,activity_exotic.class);
        startActivity(intent);
    }

    public void onacknowledgement (View view){
        Intent intent = new Intent(MainActivity.this,activity_acknowledgement.class);
        startActivity(intent);
    }

    public void onabout (View view){
        Intent intent = new Intent(MainActivity.this,activity_about.class);
        startActivity(intent);
    }

    public void onStat (View view){
        Intent intent = new Intent(MainActivity.this,activity_stats.class);
        startActivity(intent);
    }
}
