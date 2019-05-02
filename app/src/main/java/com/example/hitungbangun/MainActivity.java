package com.example.hitungbangun;

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


    public void btnPP(View view) {
        startActivity(new Intent(MainActivity.this,SegitigaAct.class));
    }

    public void hitungLingkaran(View view) {
        startActivity(new Intent(MainActivity.this,LingkaranActivity.class));

    }

    public void hitungPersegi(View view) {
        startActivity(new Intent(MainActivity.this,PersegiActivity.class));
    }
}
