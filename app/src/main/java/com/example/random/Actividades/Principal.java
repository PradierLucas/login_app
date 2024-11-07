package com.example.random.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.random.R;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        String mail =  getIntent().getStringExtra("mail");

        TextView texto =  findViewById(R.id.texto_mail);

        texto.setText("Hola!! " + mail);
    }
}