package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activityone extends AppCompatActivity {
    int val=0;
    AdView ad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityone);
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad1=(AdView)findViewById(R.id.ads1);
        AdRequest adRequest= new AdRequest.Builder().build();
        ad1.loadAd(adRequest);
    }
    public void yes(View view){
        Intent i=new Intent(this,Activitytwo.class);
        val=8;
        i.putExtra("first",val);
        startActivity(i);
    }
    public void no(View view){
        Intent i=new Intent(this,Activitytwo.class);
        val=0;
        i.putExtra("first",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
