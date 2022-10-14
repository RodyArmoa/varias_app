package com.example.varias_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irYoutube(View v){

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
        startActivity(i);
    }
    public void abrirmapa(View v){

        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 43.25058, -2.91193"));
        startActivity(i);
    }

    public  void abrirCamara(View v){

        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void enviarEmail(View v){

        Intent i = new Intent(this, MainActivityEMAIL.class);
        startActivity(i);

    }
}