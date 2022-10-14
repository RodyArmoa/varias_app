package com.example.varias_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivityEMAIL extends AppCompatActivity {

    EditText etDireccion, etTema, etContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_email);

        etDireccion= findViewById(R.id.etDireccion);
        etContenido=findViewById(R.id.etContenido);
        etTema=findViewById(R.id.etTema);
    }

    public void enviar(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{etDireccion.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT,etTema.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, etContenido.getText().toString());
        startActivity(intent);
    }

    public void atras(View v){

        Intent atras= new Intent(this, MainActivityEMAIL.class);
        startActivity(atras);
    }
}