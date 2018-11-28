package uniandes.apo2h.misapuntes.mundo;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Clase que representa un apunte dentro del programa.
 * @author Christian Aparicio
 */
public class Apunte implements Serializable
{
    //Probando

    /**
     * Constante de serialización.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constante que representa el número de caracteres del resumen del apunte.
     */
    public static final int CARACTERES_RESUMEN = 60;

    /**
     * Fecha de creación del apunte
     */
    private Calendar fecha;

    /**
     * Texto del apunte
     */
    private String textoApunte;

    /**
     *  Constructor del apunte. Inicializa la fecha con la actual.
     * @param textoApunte Texto del apunte. textoApunte != null && textoApunte != ""
     */
    public Apunte(String textoApunte)
    {
        this.textoApunte = textoApunte;
        fecha = Calendar.getInstance();
    }

    /**
     * Método que retorna el texto del apunte.
     * @return Texto del apunte.
     */
    public String darTextoApunte()
    {
        return textoApunte;
    }

    /**
     * Método que modifica el texto del apunte.
     * @param nuevoTexto Nuevo texto del apunte.
     */
    public void modificarTextoApunte(String nuevoTexto)
    {
        textoApunte = nuevoTexto;
    }

    /**
     * Método que retorna la fecha de creación del apunte.
     * @return Fecha de creación del apunte.
     */
    public Calendar darFecha()
    {
        return fecha;
    }

    /**
     * Método que modifica la fecha del apunte
     * @param fecha Nueva fecha del apunte. fecha != null
     */
    public void modificarFecha(Calendar fecha)
    {
        this.fecha = fecha;
    }

    /**
     * Método que retorna el resumen del apunte.
     * Retorna los primeros caracteres, el número de caracteres está definido por CARACTERES_RESUMEN
     * @return El resumen del apunte.
     */
    public String darResumen()
    {
        //TODO retorna un resumen de acuerdo a la documentación.
    }


}
