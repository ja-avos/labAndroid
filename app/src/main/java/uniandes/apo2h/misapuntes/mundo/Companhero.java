package uniandes.apo2h.misapuntes.mundo;

/**
 * Clase que representa un compañero de clase
 * @author Christian Aparicio
 */

public class Companhero
{

    /**
     * Nombre del compañero
     */
    private String nombre;

    /**
     * Correo electrónico del compañero.
     */
    private String correoElectronico;

    /**
     * Número telefónico del compañero.
     */
    private String numeroTelefonico;

    /**
     * Curso que comparte con el compañero.
     */
    private String clase;

    /**
     * Constructor del compañero de clase
     * @param nombre Nombre del compañero
     * @param correoElectronico Correo electrónico del compañero.
     * @param numeroTelefonico Número telefónico del compañero.
     */
    public Companhero(String nombre, String correoElectronico, String numeroTelefonico, String clase)
    {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.clase = clase;
    }

    /**
     * Método que retorna el nombre del compañero.
     * @return Nombre del compañero.
     */
    public String darNombre()
    {
        return nombre;
    }

    /**
     * Método que retorna el correo electrónico del compañero
     * @return Correo electrónico del compañero.
     */
    public String darCorreoElectronico()
    {
        return correoElectronico;
    }

    /**
     * Método que retorna el número telefónico del compañero.
     * @return Número telefónico del compañero.
     */
    public String darNumeroTelefonico()
    {
        return numeroTelefonico;
    }

    /**
     * Método que retorna la clase que está viendo con el compañero.
     * @return Clase que está viendo con el compañero.
     */
    public String darClase()
    {
        return clase;
    }

}
