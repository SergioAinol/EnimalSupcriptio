package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNuevo;
    Button btnMofificar;
    private View view;
    ArrayList<String> listaDatos;
    RecyclerView reciclador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo=findViewById(R.id.btnNuevo);
        btnMofificar=findViewById(R.id.btnModificar);

        //obtuve el reciclador
        RecyclerView recycler = (RecyclerView) findViewById(R.id.reciclador);
        //como quiero mostrarlo
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //recycler.setLayoutManager(new GridLayoutManager(this,3));

        listaDatos= new ArrayList<String>();

        //simular el llenado de datos
        for(int i=0; i<=60;i++){
            listaDatos.add("Mi Dato #"+i+"");
        }

        //utilizamos el adaptador
        Adaptador adapter= new Adaptador(listaDatos);
        recycler.setAdapter(adapter);

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