package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.enimalsupcriptio.BaseDatos.DataBaseQuerryAnimal;
import com.example.enimalsupcriptio.Modelos.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNuevo;
    Button btnMofificar;
    private View view;
    List<Animal> listaDatos;
    RecyclerView reciclador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo=findViewById(R.id.btnNuevo);
        btnMofificar=findViewById(R.id.btnModificar);

        DataBaseQuerryAnimal dbQeryAnimal1 = new DataBaseQuerryAnimal(getBaseContext());

        listaDatos=dbQeryAnimal1.obtenerAnimales();
        Adaptador adapter = new Adaptador(listaDatos);

        //obtener el reciclador
        reciclador= findViewById(R.id.recicladorAnimal);
        reciclador.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        reciclador.setAdapter(adapter);

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