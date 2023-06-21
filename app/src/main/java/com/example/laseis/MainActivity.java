package com.example.laseis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textName;
        EditText textLastName;
        EditText textEmail;
        EditText textPassword;

        TextView name = findViewById(R.id.textName);
        TextView lastName = findViewById(R.id.textLastName);
        TextView email = findViewById(R.id.textEmail);
        TextView password = findViewById(R.id.textPassword);
        Button createAccount = findViewById(R.id.buttonCreateAccount);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = name.getText().toString();
                String apellido = lastName.getText().toString();
                String correo = email.getText().toString();
                String contrasena = password.getText().toString();

                if(nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || !contrasena.contains("@") ) {
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String texto = "Nombre usuario: " + nombre + " " + apellido + ", correo: " + correo + " y contraseña:  " +contrasena;

                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();


            }
        });
    }
}