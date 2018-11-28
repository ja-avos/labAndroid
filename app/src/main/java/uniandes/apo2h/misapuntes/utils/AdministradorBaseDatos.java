package uniandes.apo2h.misapuntes.utils;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import uniandes.apo2h.misapuntes.mundo.Companhero;

/**
 * Administrador de la base de datos
 * @author Christian Aparicio
 */

public class AdministradorBaseDatos
{
    private static final String BASE_DATOS = "DBCompanheros";

    /**
     * Método que agrega a la base de datos un compañero.
     * @param actividad Actividad que intenta agregar el compañero.
     * @param companhero Compañero a agregar a la base de datos.
     */
    public static final void agregarCompanhero(Activity actividad, Companhero companhero)
    {
        CompanherosSQLiteHelper baseDatos = new CompanherosSQLiteHelper(actividad, BASE_DATOS, null,1);
        SQLiteDatabase db = baseDatos.getWritableDatabase();

        if(db != null)
        {
            //TODO Crear sentencia SQL para agregar al compañero a la base de datos.
            String sqlAgregarCompanhero = "";
            db.execSQL(sqlAgregarCompanhero);
        }

        db.close();
        baseDatos.close();
    }

    /**
     * Método que retorna la lista completa de compañeros.
     * @param actividad Actividad que requiere la lista de compañeros
     * @return Lista de compañeros.
     */
    public static final List<Companhero> darCompanheros(Activity actividad)
    {
        List<Companhero> companheros = new ArrayList<>();

        CompanherosSQLiteHelper baseDatos = new CompanherosSQLiteHelper(actividad,BASE_DATOS,null,1);
        SQLiteDatabase db = baseDatos.getReadableDatabase();

        //TODO Consulta para retornar todos los compañeros de la base de datos
        String consultaSql = "";

        Cursor cursorIterador = db.rawQuery(consultaSql, null);
        while(cursorIterador.moveToNext())
        {
            companheros.add(new Companhero(cursorIterador.getString(0), cursorIterador.getString(1), cursorIterador.getString(2), cursorIterador.getString(3)));
        }

        db.close();
        baseDatos.close();
        return companheros;
    }
}
