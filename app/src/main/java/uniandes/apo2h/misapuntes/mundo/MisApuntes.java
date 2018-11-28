package uniandes.apo2h.misapuntes.mundo;

import java.util.ArrayList;
import java.util.List;

/**
 *  Clase principal del mundo, contiene la instancia de mis apuntes.
 *  @author Christian Aparicio
 */

public class MisApuntes
{
    /**
     * Lista de cursos
     */
    private List<Curso> cursos;

    /**
     * Instancia de la clase principal del mundo.
     * De esta manera no se requiere que se cree una nueva instancia cada vez y se pueda "guardar" la información.
     */
    private static MisApuntes instancia;

    /**
     * Constructor de la clase, inicia vacío.
     */
    private MisApuntes()
    {
        cursos = new ArrayList<>();
    }

    /**
     * Método que agrega un nuevo curso a la lista de cursos con la información que recibe como parámetro.
     * @param nombre Nombre del curso
     * @param nombreProfesor Nombre del profesor que dicta el curso.
     * @param correoProfesor Correo del profesor que dicta el curso.
     */
    public void agregarCurso(String nombre, String nombreProfesor, String correoProfesor)
    {
        //TODO Agrege un curso a la lista.
    }

    /**
     * Método que retorna la lista de cursos.
     * @return Lista de cursos.
     */
    public List<Curso> darCursos()
    {
        return cursos;
    }

    /**
     * Método que retorna una instancia de MisApuntes, si ya fue creada anteriormente retorna esa instancia.
     * @return Instancia de MisApuntes que se está manejando en la aplicación.
     */
    public static MisApuntes getInstance()
    {
        if(instancia == null)
        {
            instancia = new MisApuntes();
        }
        return instancia;
    }
}
