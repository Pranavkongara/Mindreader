package com.andriod.gamers.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actvityfinal extends AppCompatActivity {
    int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvityfinal);
        Bundle last=getIntent().getExtras();
        val=last.getInt("sixth");
        String a=Integer.toString(val);
        TextView text=(TextView)findViewById(R.id.textView7);
        text.setText("The number you have choosen is "+a);

    }
    public void playagain(View view){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void onBackPressed(){
        Toast.makeText(this, "Back button is disabled in this screen", Toast.LENGTH_SHORT).show();
    }
}
