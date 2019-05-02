package com.example.hitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText edtSisi;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        edtSisi = findViewById(R.id.edt_sisi);
        tvhasil = findViewById(R.id.tv_hasil);
    }

    public void hitungKeliling(View view) {
        int sisi = Integer.parseInt(edtSisi.getText().toString());
        //Rumus Keliling
        int keliling = 4 * sisi;

        tvhasil.setText(String.valueOf(keliling));
    }

    public void hitungLuas(View view) {
        int sisi = Integer.parseInt(edtSisi.getText().toString());
        //Rumus Luas5
        int luas = sisi* sisi;
        tvhasil.setText(String.valueOf(luas));
    }
}
