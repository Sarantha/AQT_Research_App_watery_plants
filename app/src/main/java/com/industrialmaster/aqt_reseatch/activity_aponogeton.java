package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_aponogeton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aponogeton);
    }

    public void oncrispus (View view){
        Intent intent = new Intent(activity_aponogeton.this,activity_aponogeton_crispus.class);
        startActivity(intent);
    }

    public void onjacobsonii (View view){
        Intent intent = new Intent(activity_aponogeton.this,activity_aponogeton_jacobsonii.class);
        startActivity(intent);
    }

    public void onnatans (View view){
        Intent intent = new Intent(activity_aponogeton.this,activity_aponogeton_natans.class);
        startActivity(intent);
    }

    public void onrigidifolius (View view){
        Intent intent = new Intent(activity_aponogeton.this,activity_aponogeton_rigidifolius.class);
        startActivity(intent);
    }
}
