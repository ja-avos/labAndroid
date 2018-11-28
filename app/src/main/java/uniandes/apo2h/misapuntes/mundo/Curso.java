package uniandes.apo2h.misapuntes.mundo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un curso dentro de la aplicación.
 */
public class Curso implements Serializable
{
    /**
     * Nombre del curso.
     */
    private String nombre;

    /**
     * Nombre del profesor que dicta el curso.
     */
    private String nombreProfesor;

    /**
     * Correo del profesor.
     */
    private String correoProfesor;

    /**
     * Lista de apuntes.
     */
    private List<Apunte> apuntes;

    /**
     * Método constructor de curso
     * @param nombre Nombre del curso
     * @param nombreProfesor Nombre del profesor
     * @param correoProfesor Correo del profesor
     */
    public Curso(String nombre, String nombreProfesor, String correoProfesor)
    {
        this.nombre = nombre;
        this.nombreProfesor = nombreProfesor;
        this.correoProfesor = correoProfesor;
        apuntes = new ArrayList<>();
    }

    /**
     * Método que crea un nuevo apunto con el texto que llega como parámetro y lo agrega a la lista de apuntes del curso
     * @param textoApunte El texto del apunte
     */
    public void agregarApunte(String textoApunte)
    {
        //TODO Agrega un apunte de acuerdo a la documentación.
    }

    /**
     * Método que retorna el nombre del curso.
     * @return Nombre del curso.
     */
    public String darNombre()
    {
        return nombre;
    }

    /**
     * Método que modifica el nombre del curso
     * @param nombre Nuevo nombre del curso
     */
    public void modificarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Método que retorna el nombre del profesor que dicta el curso.
     * @return Nombre del profesor que dicta el curso.
     */
    public String darNombreProfesor()
    {
        return nombreProfesor;
    }

    /**
     * Método que modifica el nombre del profesor del curso.
     * @param nombreProfesor Nuevo nombre del profesor que dicta el curso.
     */
    public void modificarNombreProfesor(String nombreProfesor)
    {
        this.nombreProfesor = nombreProfesor;
    }

    /**
     * Método que retorna el correo del profesor
     * @return Correo del profesor.
     */
    public String darCorreoProfesor()
    {
        return correoProfesor;
    }

    /**
     * Método que modifica el correo del profesor
     * @param correoProfesor Nuevo correo del profesor.
     */
    public void modificarCorreoProfesor(String correoProfesor)
    {
        this.correoProfesor = correoProfesor;
    }

    /**
     * Método que retorna la lista de apuntes
     * @return
     */
    public List<Apunte> darApuntes()
    {
        return apuntes;
    }
}
