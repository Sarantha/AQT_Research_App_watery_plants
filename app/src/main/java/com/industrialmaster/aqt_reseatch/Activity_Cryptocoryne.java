package com.industrialmaster.aqt_reseatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Cryptocoryne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__cryptocoryne);
    }

    public void onBecketti (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_becketti.class);
        startActivity(intent);
    }

    public void onWendtii (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_wendtii.class);
        startActivity(intent);
    }

    public void onParva (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_parva.class);
        startActivity(intent);
    }

    public void onWillisii (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_willisii.class);
        startActivity(intent);
    }

    public void onthwaitesii (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,acttivity_cryptocoryne_thwaitesii.class);
        startActivity(intent);
    }

    public void onalba (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_alba.class);
        startActivity(intent);
    }

    public void onbogneri (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_bogneri.class);
        startActivity(intent);
    }

    public void onWelkeri (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_walkeri.class);
        startActivity(intent);
    }

    public void onNevilli (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_nevillii.class);
        startActivity(intent);
    }

    public void onUndulata (View view){
        Intent intent = new Intent(Activity_Cryptocoryne.this,activity_cryptocoryne_undulata.class);
        startActivity(intent);
    }
}
