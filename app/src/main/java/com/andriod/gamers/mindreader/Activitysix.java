package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activitysix extends AppCompatActivity {
    int val;
    AdView ad6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitysix);
        Bundle sixth=getIntent().getExtras();
        val=sixth.getInt("fifth");
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad6=(AdView)findViewById(R.id.ads6);
        AdRequest adRequest= new AdRequest.Builder().build();
        ad6.loadAd(adRequest);
    }
    public void yes6(View view){
        Intent i=new Intent(this,Actvityfinal.class);
        val=val+4;
        i.putExtra("sixth",val);
        startActivity(i);
    }
    public void no6(View view){
        Intent i=new  Intent(this,Actvityfinal.class);
        i.putExtra("sixth",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
