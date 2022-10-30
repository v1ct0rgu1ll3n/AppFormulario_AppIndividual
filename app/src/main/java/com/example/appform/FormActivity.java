package com.example.appform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button btnguardar;

    EditText txtnombre, txtapellido, txtemail, txttelefono, txtdireccion;
    RadioButton rbhombre, rbmujer, rbotro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        txtnombre = findViewById(R.id.txtnombre);
        txtapellido = findViewById(R.id.txtapellido);
        txtemail = findViewById(R.id.txtemail);
        txttelefono = findViewById(R.id.txttelefono);
        txtdireccion = findViewById(R.id.txtdireccion);

        rbhombre = findViewById(R.id.rbhombre);
        rbmujer = findViewById(R.id.rbmujer);
        rbotro = findViewById(R.id.rbotro);

        btnguardar = findViewById(R.id.btnguardar);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if (txtnombre.getText().toString().equals("") || txtapellido.getText().toString().equals("")||
                txtemail.getText().toString().equals("") || txttelefono.getText().toString().equals("")||
                txtdireccion.getText().toString().equals("")  ){

                Toast.makeText(FormActivity.this,"Diligencia todos los campos",Toast.LENGTH_LONG).show();

            }else{

                Intent intent = new Intent(FormActivity.this, GuardarActivity.class);
                intent.putExtra("txtnombre",txtnombre.getText().toString());
                intent.putExtra("txtapellido",txtapellido.getText().toString());
                intent.putExtra("txtemail",txtemail.getText().toString());
                intent.putExtra("txttelefono",txttelefono.getText().toString());
                intent.putExtra("txtdireccion",txtdireccion.getText().toString());

                String genero = "";

                if (rbhombre.isChecked()){
                    genero= "Hombre";
                }else if (rbmujer.isChecked()){
                    genero= "Mujer";
                } else{
                    genero= "Otro";
                }

                intent.putExtra("genero",genero);
                startActivity(intent);


            }




            }
        });



    }
}