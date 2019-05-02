package com.example.hitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SegitigaAct extends AppCompatActivity {

    EditText etALas, etTinggi, etSisi;
    Button btLuas, btKeliling;

    int intAlas = 0, intTinggi=0, intSisi =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        //edit text
        etALas = findViewById(R.id.etAlas);
        etTinggi = findViewById(R.id.etTinggi);
        etSisi = findViewById(R.id.etSisi);

        //button
        btKeliling = findViewById(R.id.btKeliling);
        btLuas = findViewById(R.id.btLuas);

        btKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etSisi.getText().toString().isEmpty()){
                    Toast.makeText(SegitigaAct.this, "sis tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else {
                     intSisi = Integer.parseInt(etSisi.getText().toString());
                    int intKeliling = intSisi * 3;
                    Toast.makeText(SegitigaAct.this,
                            "HASIL KELILING = "+String.valueOf(intKeliling), Toast.LENGTH_SHORT).show();

                }
                }
        });

        btLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intAlas = Integer.parseInt(etALas.getText().toString());
                int intTInggi = Integer.parseInt(etTinggi.getText().toString());
                int intLuas = (intAlas * intTInggi)/2;
                Toast.makeText(SegitigaAct.this,
                        "HASIL LUAS = "+String.valueOf(intLuas), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
