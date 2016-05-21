package com.example.ana_a.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView tvNombre, tvTel, tvEmail, tvDescripcion,tvFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle parametros = getIntent().getExtras();
        String nom = parametros.getString("Nombre");
        String tel = parametros.getString("Telefono");
        String email = parametros.getString("Email");
        String desc = parametros.getString("Descripcion");
        String fech = parametros.getString("Fecha");

         tvNombre       = (TextView)findViewById(R.id.tvNombre);
         tvTel          = (TextView)findViewById(R.id.tvTel);
         tvEmail        = (TextView)findViewById(R.id.tvEmail);
         tvDescripcion  = (TextView)findViewById(R.id.tvDescripcion);
         tvFecha        = (TextView)findViewById(R.id.tvFeha);
        Button botonEditar = (Button)findViewById(R.id.btnEditar);


        tvNombre.setText(nom);
        tvTel.setText(tel);
               tvEmail.setText(email);
               tvDescripcion.setText(desc);
               tvFecha.setText(fech);

               botonEditar.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent2 = new Intent(Activity2.this, MainActivity.class);

                       intent2.putExtra("Nombre2",tvNombre.getText().toString());
               intent2.putExtra("Telefono2", tvTel.getText().toString());
               intent2.putExtra("Email2", tvEmail.getText().toString());
               intent2.putExtra("Descripcion2", tvDescripcion.getText().toString());
               MainActivity.a=1;

               startActivity(intent2);

           }
       });
    }
}
