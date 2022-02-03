package com.example.crudfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView dm, pindahkelas, absen, daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dm = (ImageView) findViewById(R.id.btnDm);
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(),directmessage.class);
                startActivity(p);
            }
        });

        pindahkelas = (ImageView) findViewById(R.id.btnKelas);
        pindahkelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(),kelas.class);
                startActivity(p);
            }
        });

        absen = (ImageView) findViewById(R.id.btnAbsen);
        absen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(),directmessage.class);
                startActivity(p);
            }
        });

        daftar = (ImageView) findViewById(R.id.btnDaftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(),directmessage.class);
                startActivity(p);
            }
        });
    }
}