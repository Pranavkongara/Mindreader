package com.andriod.gamers.mindreader;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View view){
        Intent i=new Intent(this,Instructions.class);
        startActivity(i);
    }
    public void Feedback(View view){
        Intent i=new Intent(this,Feedback.class);
        startActivity(i);
    }
    public void exit1(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    @Override
    public void onBackPressed(){
        System.exit(1);
    }
}
