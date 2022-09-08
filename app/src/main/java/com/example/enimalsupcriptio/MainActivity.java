package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo=findViewById(R.id.btnNuevo);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Cambiando a Nuevo Registro",Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this,MainNuevo.class);
        startActivity(i);
    }
}