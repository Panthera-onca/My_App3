package com.example.myapplication.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class BActivity extends AppCompatActivity {
    private static final String TAG ="ACOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Intent intent = getIntent();
        Log.i(TAG, intent.getStringExtra("uneChaine"));
        Log.i(TAG, String.valueOf(intent.getIntExtra("UnChiffre", 14540)));
        Log.i(TAG, String.valueOf(intent.getParcelableExtra("utilisateur")));

    }
}