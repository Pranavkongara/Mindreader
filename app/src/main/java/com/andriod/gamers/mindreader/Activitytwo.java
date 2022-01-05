package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activitytwo extends AppCompatActivity {
    int val;
    AdView ad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Bundle second=getIntent().getExtras();
        val=second.getInt("first");
        MobileAds.initialize(this,"ca-app-pub-7125179191865747~9154109520");
        ad2=(AdView)findViewById(R.id.ads2);
        AdRequest adRequest2=new AdRequest.Builder().build();
        ad2.loadAd(adRequest2);
    }
    public void yes2(View view){
        Intent i=new Intent(this,Activitythree.class);
        val=val+16;
        i.putExtra("second",val);
        startActivity(i);
    }
    public void no2(View view){
        Intent i=new Intent(this,Activitythree.class);
        i.putExtra("second",val);
        startActivity(i);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
