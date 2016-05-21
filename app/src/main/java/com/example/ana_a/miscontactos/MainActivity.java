package com.example.ana_a.miscontactos;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText nombre, telefono, email, descripcion;
    private DatePicker fecha;
   static int a=0;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (a!=0)
        {
        Bundle parametros2 = getIntent().getExtras();
        String nom = parametros2.getString("Nombre2");
        String tel = parametros2.getString("Telefono2");
        String Email = parametros2.getString("Email2");
        String desc = parametros2.getString("Descripcion2");

        nombre.setText(nom);
        telefono.setText(tel);
        email.setText(Email);
        descripcion.setText(desc);

    }
        nombre        = (EditText) findViewById(R.id.edtNombre);
        telefono      = (EditText) findViewById(R.id.edtTelefono);
        email         = (EditText) findViewById(R.id.edtEmail);
        descripcion   = (EditText)findViewById(R.id.edtDescripcion);
        boton         = (Button)findViewById(R.id.boton);
        fecha         = (DatePicker)findViewById(R.id.pickerfecha);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // String edtNombre = nombre.getText().toString();
               // String edtTelefono = telefono.getText().toString();
               //String edtEmail =  email.getText().toString();
               // String edtDescripcion = descripcion.getText().toString();
                int dia = fecha.getDayOfMonth();
                int mes = fecha.getMonth();
                int ayo= fecha.getYear();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Nombre",nombre.getText().toString());
                intent.putExtra("Telefono", telefono.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                intent.putExtra("Descripcion", descripcion.getText().toString());
                //intent.putExtra("Fecha",fecha.getDayOfMonth()+" "+fecha.getMonth()+" "+fecha.getYear());
                intent.putExtra("Fecha",dia+" "+mes+"  " +ayo);
                startActivity(intent);
            }
        });



    }
}
