package com.example.fachrezifadel.fadelfachrezi_1202150035_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            setTitle("AsyncTask");
        }
        //method saat button Onclick
        public void mahasiswa(View view) {
            //untuk berpindah ke aktivitas mahasiswa//
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        //method saat button Onclick
        public void gambar(View view) {
            //untuk berpindah ke aktivitas gambar//
            Intent intent = new Intent(this, gambar.class);
            startActivity(intent);
        }
    }
