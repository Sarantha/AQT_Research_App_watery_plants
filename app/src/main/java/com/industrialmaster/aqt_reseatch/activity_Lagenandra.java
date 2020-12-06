package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_Lagenandra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lagenandra);
    }

    public void onpraetermissa (View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_praetermissa.class);
        startActivity(intent);
    }

    public void onlancifolia (View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_lancifolia.class);
        startActivity(intent);
    }

    public void onkoenigii (View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_koenigii.class);
        startActivity(intent);
    }

    public void onerosa (View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_erosa.class);
        startActivity(intent);
    }

    public void onjacobsenii (View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_jacobsenii.class);
        startActivity(intent);
    }

    public void onthwaitesii(View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_thwaitesii.class);
        startActivity(intent);
    }

    public void onlbogneri(View view){
        Intent intent = new Intent(activity_Lagenandra.this,activity_lagenandra_bogneri.class);
        startActivity(intent);
    }
}
