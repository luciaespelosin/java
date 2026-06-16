package universidad.asignaturas.noPromocionales;

import universidad.asignaturas.Asignatura;
import universidad.asignaturas.CategoriaAsignatura;

/**
 * Representa una asignatura que no permite la promoción directa.
 * Las subclases definen el porcentaje concreto de habilitación.
 */
public abstract class AsignaturaNoPromocional extends Asignatura {

    /**
     * @param codigo       Código único de la asignatura.
     * @param nombre       Nombre de la asignatura.
     * @param cuatrimestre Cuatrimestre en que se dicta (1 a 10).
     * @param categoria    Categoría de la asignatura.
     */
    public AsignaturaNoPromocional(String codigo, String nombre, int cuatrimestre, CategoriaAsignatura categoria) {
        super(codigo, nombre, cuatrimestre, false, categoria);
    }

    /**
     * Las asignaturas no promocionales nunca permiten promocionar.
     * @return -1.0 — valor centinela que indica que no hay promoción.
     */
    @Override
    public final double porcentajePromocion() {
        return -1.0;
    }
}