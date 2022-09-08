package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainNuevo extends AppCompatActivity implements View.OnClickListener{

Button btnNuevoSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nuevo);

        btnNuevoSalir=findViewById(R.id.btnNuevoSalir);

    }


    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Cambiando a Registro",Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainNuevo.this,MainActivity.class);
        startActivity(i);
    }
}