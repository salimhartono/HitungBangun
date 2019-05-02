package com.example.hitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        //Hubungkan widget id layoutnya
        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        tvHasil = findViewById(R.id.tv_hasil);
    }

    public void btn_hitng_keliling(View view) {
        int p = Integer.parseInt(edtPanjang.getText().toString());
        int l = Integer.parseInt(edtLebar.getText().toString());
        //Rumus Keliling
        int keliling = (p+l)*2 ;

        tvHasil.setText(String.valueOf(keliling));
    }

    public void brt_hitung_luas(View view) {
        int p = Integer.parseInt(edtPanjang.getText().toString());
        int l = Integer.parseInt(edtLebar.getText().toString());
        // Rumus Luas
        int luas = p*l ;

        tvHasil.setText(String.valueOf(luas));
    }
}
