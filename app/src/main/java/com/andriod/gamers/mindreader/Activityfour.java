package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activityfour extends AppCompatActivity {
    int val;
    AdView ad4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfour);
        Bundle fourth=getIntent().getExtras();
        val=fourth.getInt("third");
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad4=(AdView)findViewById(R.id.ads4);
        AdRequest adRequest= new AdRequest.Builder().build();
        ad4.loadAd(adRequest);
    }
    public void yes4(View view){
        Intent i=new Intent(this,Activityfive.class);
        val=val+32;
        i.putExtra("fourth",val);
        startActivity(i);
    }
    public void no4(View view){
        Intent i=new  Intent(this,Activityfive.class);
        i.putExtra("fourth",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
