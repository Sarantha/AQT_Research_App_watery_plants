package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_endemic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endemic);
    }
    public void onExotic (View view){
        Intent intent = new Intent(activity_endemic.this,activity_exotic.class);
        startActivity(intent);
    }

    public void onCrypto (View view){
        Intent intent = new Intent(activity_endemic.this,Activity_Cryptocoryne.class);
        startActivity(intent);
    }

    public void onLagenandra (View view){
        Intent intent = new Intent(activity_endemic.this,activity_Lagenandra.class);
        startActivity(intent);
    }

    public void onAponogeton (View view){
        Intent intent = new Intent(activity_endemic.this,activity_aponogeton.class);
        startActivity(intent);
    }

    public void onStat (View view){
        Intent intent = new Intent(activity_endemic.this,activity_stats.class);
        startActivity(intent);
    }
}
