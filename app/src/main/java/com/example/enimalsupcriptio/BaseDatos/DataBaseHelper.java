package com.example.enimalsupcriptio.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper databaseHelper;

    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME= Config.DATABASE_NAME;

    private DataBaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public static synchronized DataBaseHelper getInstance(Context context){
        if(databaseHelper==null){
            databaseHelper= new DataBaseHelper(context);
        }
        return databaseHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREAR_TABLA_ANIMAL = "CREATE TABLE " + Config.TABLA_ANIMAL + "("
                + Config.COLUMNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Config.COLUMNA_NUMERO + " INTEGER,"
                + Config.COLUMNA_TIPO + " TEXT NOT NULL,"
                + Config.COLUMNA_ARETE + " INTEGER NOT NULL,"
                + Config.COLUMNA_PARICIONES + " INTEGER,"
                + Config.COLUMNA_FECHA_TIPO_SEXO + " TEXT,"
                + Config.COLUMNA_HIJO_HIJA + " TEXT,"
                + Config.COLUMNA_ANIO_NACIMIENTO + " INTEGER,"
                + Config.COLUMNA_RAZA + " TEXT,"
                + Config.COLUMNA_OBSERVACIONES + " TEXT "
                +")";
        db.execSQL(CREAR_TABLA_ANIMAL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + Config.TABLA_ANIMAL);
        onCreate(db);
    }
}
