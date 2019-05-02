package com.example.hitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText edtJari2;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        edtJari2=findViewById(R.id.edt_jari2);
        tvHasil=findViewById(R.id.tv_hasil);
    }

    public void hitungLuas(View view) {
        double r = Integer.parseInt(edtJari2.getText().toString());

        //Rumus Luas
        double p = 3.142;
        double luas = p * r * r;

        tvHasil.setText(String.valueOf(luas));
    }

    public void hitungKeliling(View view) {
        double r = Double.parseDouble(edtJari2.getText().toString());
        //Rumus Keliling
        //double p = 22/7;
        double keliling = (22 * r * 2)/7;
        tvHasil.setText(String.valueOf(keliling));
    }
}
