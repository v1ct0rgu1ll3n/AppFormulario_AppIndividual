package com.example.appform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuardarActivity extends AppCompatActivity {

    TextView txtdatos;

    Button btnvolver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        txtdatos = findViewById(R.id.txtdatos);

        String datos = "Nombre: " + getIntent().getStringExtra("txtnombre") +
                     "\nApellido: " + getIntent().getStringExtra("txtapellido") +
                    "\nEmail: " + getIntent().getStringExtra("txtemail") +
                    "\nTelefono: " + getIntent().getStringExtra("txttelefono") +
                    "\nDirección: " + getIntent().getStringExtra("txtdireccion");

        txtdatos.setText(datos);

        btnvolver = findViewById(R.id.btnvolver);
        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuardarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}