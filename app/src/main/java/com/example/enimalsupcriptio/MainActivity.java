package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNuevo;
    Button btnMofificar;
    private View view;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo=findViewById(R.id.btnNuevo);
        btnMofificar=findViewById(R.id.btnModificar);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Cambiando a Nuevo Registro",Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this,MainNuevo.class);
        startActivity(i);
    }


    public void onClick1 (View view1) {
        Toast.makeText(getApplicationContext(),"Cambiando a Modificar",Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this,MainModificar.class);
        startActivity(i);
    }

}