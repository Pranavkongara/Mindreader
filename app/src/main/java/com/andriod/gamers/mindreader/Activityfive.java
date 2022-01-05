package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activityfive extends AppCompatActivity {
    int val;
    AdView ad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfive);
        Bundle fifth=getIntent().getExtras();
        val=fifth.getInt("fourth");
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad5=(AdView)findViewById(R.id.ads5);
        AdRequest adRequest= new AdRequest.Builder().build();
        ad5.loadAd(adRequest);
    }
    public void yes5(View view){
        Intent i=new Intent(this,Activitysix.class);
        val=val+1;
        i.putExtra("fifth",val);
        startActivity(i);
    }
    public void no5(View view){
        Intent i=new  Intent(this,Activitysix.class);
        i.putExtra("fifth",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
