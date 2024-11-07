package com.example.random.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.random.R;
import com.example.random.modelos.Usuario;

public class MainActivity extends AppCompatActivity {

    EditText input_mail;
    EditText input_password;

    Button btn_ingresar;



    Usuario usuario = new Usuario("lucas@mail.com","1234");
    String mail = usuario.getNombre_usuario().toString();
    String clave = usuario.getClave().toString();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input_mail= findViewById(R.id.activity_main_input_mail);
        input_password= findViewById(R.id.activity_main_input_password);
        btn_ingresar = findViewById(R.id.activity_main_btn_login);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String texto = input_mail.getText().toString().trim();
                String password = input_password.getText().toString().trim();

                if (texto.equals(mail) && password.equals(clave) ) {
                    Toast.makeText(MainActivity.this,"Bienvenido! " + texto, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Buena memoria! " + password, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Principal.class);
                    intent.putExtra("mail", mail );

                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,"Email o clave incorrecta" , Toast.LENGTH_SHORT).show();

                }


            }
        });
    }


}

