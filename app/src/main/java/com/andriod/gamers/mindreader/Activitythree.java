package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activitythree extends AppCompatActivity {
    int val;
    AdView ad3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythree);
        Bundle third=getIntent().getExtras();
        val=third.getInt("second");
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad3=(AdView)findViewById(R.id.ads3);
        AdRequest adRequest= new AdRequest.Builder().build();
        ad3.loadAd(adRequest);
    }
    public void yes3(View view){
        Intent i=new Intent(this,Activityfour.class);
        val=val+2;
        i.putExtra("third",val);
        startActivity(i);
    }
    public void no3(View view){
        Intent i=new Intent(this,Activityfour.class);
        i.putExtra("third",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
