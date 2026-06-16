package universidad.asignaturas.promocionales;

import universidad.asignaturas.Asignatura;
import universidad.asignaturas.CategoriaAsignatura;
/**
 * Representa una asignatura que permite la promoción directa.
 * Las subclases definen los porcentajes concretos de habilitación y promoción.
 */
public abstract class AsignaturaPromocional extends Asignatura {

    /**
     * @param codigo       Codigo de la asignatura.
     * @param nombre       Nombre de la asignatura.
     * @param cuatrimestre Cuatrimestre en que se dicta.
     * @param categoria    Categoría de la asignatura.
     */
    public AsignaturaPromocional(String codigo, String nombre, int cuatrimestre, CategoriaAsignatura categoria) {
        super(codigo, nombre, cuatrimestre, true, categoria);
    }
}
