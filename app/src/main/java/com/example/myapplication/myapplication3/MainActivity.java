package com.example.myapplication.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.myapplication3.bo.Utilisateur;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Nous sommes dans la fonction onCreate()");
        super.onCreate(savedInstanceState);

        Log.i(TAG, "Nous sommes dans contentView");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        Log.i(TAG, "Nous sommes dans la fonction onStart");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.i(TAG, "Nous sommes dans la fonction onResume");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.i(TAG, "Nous sommes dans la fonction onPause");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.i(TAG, "Nous sommes dans la fonction onStop");
        super.onStop();
    }

    @Override
    protected void onRestart(){
        Log.i(TAG, "Nous sommes dans la fonction onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy(){
        Log.i(TAG, "Nous sommes dans la fonction onDestroy");
        super.onDestroy();
    }

    public void onClickBouton(View view) {
        Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
    }

    public void onClickBouton2(View view) {
        Intent intention = new Intent(this, NewActivity.class);
        startActivity(intention);
    }

    public void onClickEnvoi(View view) {
        Intent intention = new Intent(this, BActivity.class);
        intention.putExtra("uneChaine","On ne vois bien qu'avec le coueur");
        intention.putExtra("UnChiffre", 14540);
        intention.putExtra("utilisateur", new Utilisateur("Coson", "Anthony"));

        startActivity(intention);
    }
}