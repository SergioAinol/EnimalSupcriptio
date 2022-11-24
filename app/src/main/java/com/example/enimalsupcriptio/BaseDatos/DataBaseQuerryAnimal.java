package com.example.enimalsupcriptio.BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

import com.example.enimalsupcriptio.Modelos.Animal;

import java.util.ArrayList;
import java.util.List;

public class DataBaseQuerryAnimal {

    private Context context;

    public DataBaseQuerryAnimal(Context context) {
        this.context = context;
    }

    public Integer insertarAnimal(Animal a){
        Integer idAnimal=a.getId();
        DataBaseHelper databaseHelper = DataBaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        ContentValues contenido= new ContentValues();
        contenido.put(Config.COLUMNA_ID,a.getId());
        contenido.put(Config.COLUMNA_NUMERO,a.getNumero());
        contenido.put(Config.COLUMNA_TIPO,a.getTipo());
        contenido.put(Config.COLUMNA_ARETE,a.getArete());
        contenido.put(Config.COLUMNA_PARICIONES,a.getPariciones());
        contenido.put(Config.COLUMNA_FECHA_TIPO_SEXO,a.getFechaTipoSexo());
        contenido.put(Config.COLUMNA_HIJO_HIJA,a.getHijoHija());
        contenido.put(Config.COLUMNA_ANIO_NACIMIENTO,a.getAnioNacimiento());
        contenido.put(Config.COLUMNA_RAZA,a.getRaza());
        contenido.put(Config.COLUMNA_OBSERVACIONES,a.getObservaciones());
        try{
            sqLiteDatabase.insertOrThrow(Config.TABLA_ANIMAL,null,contenido);
        }
        catch(SQLiteException e){
            Toast.makeText(context, "Falló la inserción: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            sqLiteDatabase.close();
        }
        return idAnimal;
    }

    public List<Animal> obtenerAnimales(){

        DataBaseHelper databaseHelper = DataBaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

        Cursor cursor=null;
        try{
            cursor=  sqLiteDatabase.query(Config.TABLA_ANIMAL,null,null,null,null,null,null,null);
            if(cursor!=null)
                if(cursor.moveToFirst()){
                    List<Animal> listaObtenida= new ArrayList<>();
                    do{
                        Animal animalObtenido=new Animal();
                        //obtengo valores de la BD
                        Integer id = cursor.getInt(cursor.getColumnIndex(Config.COLUMNA_ID));
                        Integer numero = cursor.getInt (cursor.getColumnIndex(Config.COLUMNA_NUMERO));
                        String tipo = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_TIPO));
                        Integer arete = cursor.getInt(cursor.getColumnIndex(Config.COLUMNA_ARETE));
                        Integer pariciones = cursor.getInt(cursor.getColumnIndex(Config.COLUMNA_PARICIONES));
                        String fechaTipoSexo = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_FECHA_TIPO_SEXO));
                        String hijoHija = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_HIJO_HIJA));
                        Integer anioNacimiento = cursor.getInt(cursor.getColumnIndex(Config.COLUMNA_ANIO_NACIMIENTO));
                        String raza = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_RAZA));
                        String observaciones = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_OBSERVACIONES));
                        //se los asigno
                        animalObtenido.setId(id);
                        animalObtenido.setNumero(numero);
                        animalObtenido.setTipo(tipo);
                        animalObtenido.setArete(arete);
                        animalObtenido.setPariciones(pariciones);
                        animalObtenido.setFechaTipoSexo(fechaTipoSexo);
                        animalObtenido.setHijoHija(hijoHija);
                        animalObtenido.setAnioNacimiento(anioNacimiento);
                        animalObtenido.setRaza(raza);
                        animalObtenido.setObservaciones(observaciones);
                        //agrego animal a la lista
                        listaObtenida.add(animalObtenido);

                    }while(cursor.moveToNext());
                    return listaObtenida;
                }
        }
        catch(SQLiteException e){
            Toast.makeText(context, "Error al listar: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            sqLiteDatabase.close();
        }
        return new ArrayList<Animal>();
    }
}
