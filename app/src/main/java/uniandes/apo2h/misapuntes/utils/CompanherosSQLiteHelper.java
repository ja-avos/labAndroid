package uniandes.apo2h.misapuntes.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * helper que crea la base de datos SQLite
 */

public class CompanherosSQLiteHelper extends SQLiteOpenHelper
{

    //TODO Completar la sentencia sql para crear la tabla de companheros
    String sqlCreate = "";
    public CompanherosSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        //Al realizar una actualización de la base de datos (puede ser por cuestiones del sistema operativo), se ejecutan estas líneas de código.
        //Simplemente vamos a borrar y volver a crear la base de datos.

        db.execSQL("DROP TABLE IF EXISTS Companheros");

        db.execSQL(sqlCreate);
    }
}
