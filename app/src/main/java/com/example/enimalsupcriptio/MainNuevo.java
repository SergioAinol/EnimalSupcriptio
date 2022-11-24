package com.example.enimalsupcriptio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.enimalsupcriptio.BaseDatos.DataBaseQuerryAnimal;
import com.example.enimalsupcriptio.Modelos.Animal;

public class MainNuevo extends AppCompatActivity {

    private EditText numero;
    private EditText tipo;
    private EditText arete;
    private EditText pariciones;
    private EditText fechaTipoSexo;
    private EditText hijoHija;
    private EditText anioNacimiento;
    private EditText raza;
    private EditText observaciones;
    private Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nuevo);

        numero = this.findViewById(R.id.editTextNumberNumero);
        tipo = this.findViewById(R.id.editTextTipo);
        arete = this.findViewById(R.id.editTextNumberArete);
        pariciones = this.findViewById(R.id.editTextNumberPariciones);
        fechaTipoSexo = this.findViewById(R.id.editTextFechaTipoSexo);
        hijoHija = this.findViewById(R.id.editTextHijoHija);
        anioNacimiento = this.findViewById(R.id.editTextNumberAnioNacimiento);
        raza = this.findViewById(R.id.editTextRaza);
        observaciones = this.findViewById(R.id.editTextObservaciones);
        btnAgregar = this.findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animal animalNuevo = new Animal();
                animalNuevo.setNumero(Integer.parseInt(numero.getText().toString()));
                animalNuevo.setTipo(tipo.getText().toString());
                animalNuevo.setArete(Integer.parseInt(arete.getText().toString()));
                animalNuevo.setPariciones(Integer.parseInt(pariciones.getText().toString()));
                animalNuevo.setFechaTipoSexo(fechaTipoSexo.getText().toString());
                animalNuevo.setHijoHija(hijoHija.getText().toString());
                animalNuevo.setAnioNacimiento(Integer.parseInt(anioNacimiento.getText().toString()));
                animalNuevo.setRaza(raza.getText().toString());
                animalNuevo.setObservaciones(observaciones.getText().toString());

                DataBaseQuerryAnimal dbQeryAnimal = new DataBaseQuerryAnimal(getBaseContext());

                dbQeryAnimal.insertarAnimal(animalNuevo);
            }
        });

    }


}