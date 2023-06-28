package com.example.laseis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laseis.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = binding.textName.getText().toString();
                String apellido = binding.textLastName.getText().toString();
                String correo = binding.textEmail.getText().toString();
                String contrasena = binding.textPassword.getText().toString();

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