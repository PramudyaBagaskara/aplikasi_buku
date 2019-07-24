package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bhasil;
    private EditText xbuku,xpengarang,xhalaman,xtahun;
    private TextView zbuku,zpengarang,zhalaman,ztahun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        xbuku = findViewById(R.id.jdlbuku);
        xpengarang = findViewById(R.id.nmpengarang);
        xhalaman = findViewById(R.id.jmlhalaman);
        xtahun = findViewById(R.id.thnterbit);
        bhasil = findViewById(R.id.idhasil);
        zbuku = findViewById(R.id.rjudul);
        zpengarang = findViewById(R.id.rpengarang);
        zhalaman = findViewById(R.id.rhalaman);
        ztahun = findViewById(R.id.rtahun);
        bhasil.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.idhasil) {

            String inputJudul = xbuku.getText().toString().trim();
            String inputPengarang = xpengarang.getText().toString().trim();
            String inputHalaman = xhalaman.getText().toString().trim();
            String inputTahun = xtahun.getText().toString().trim();

            boolean isInvalidFields = false;

            if (inputJudul == null) {

                isInvalidFields = true;
                xbuku.setError("Ga Boleh Kosong");
            }
            if (inputPengarang == null) {

                isInvalidFields = true;
                xpengarang.setError("Ga Boleh Kosong");
            }
            if (inputHalaman == null) {

                isInvalidFields = true;
                xhalaman.setError("Ga Boleh Kosong");
            }
            if (inputTahun == null) {

                isInvalidFields = true;
                xtahun.setError("Ga Boleh Kosong");
            }

            if (!isInvalidFields) {

                zbuku.setText("Judul Buku :" + inputJudul);
                zpengarang.setText("Judul Buku :" + inputPengarang);
                zhalaman.setText("Halaman :" + inputHalaman);
                ztahun.setText("Tahun Terbit :" + inputTahun);

            }

        }


    }
}
