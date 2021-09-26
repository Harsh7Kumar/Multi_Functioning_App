package com.myactivity.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newactivity2(View view) {
        Intent activity2Intent = new Intent(getApplicationContext(), Activity2.class);
        startActivity(activity2Intent);
    }

    public void newactivity3(View view) {
        Intent activity3Intent = new Intent(getApplicationContext(), Activity3.class);
        startActivity(activity3Intent);
    }

    public void newactivity4(View view) {
        Intent activity4Intent = new Intent(getApplicationContext(), Activity4.class);
        startActivity(activity4Intent);
    }
    public void newactivity5(View view) {
        Intent activity5Intent = new Intent(getApplicationContext(), Activity5.class);
        startActivity(activity5Intent);
    }

}
