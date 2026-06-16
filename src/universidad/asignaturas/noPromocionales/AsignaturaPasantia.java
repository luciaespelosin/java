package universidad.asignaturas.noPromocionales;

import universidad.asignaturas.CategoriaAsignatura;

/**
 * Asignatura de tipo pasantía (práctica laboral), no promocional.
 * Requiere 75% de asistencia para habilitar.
 */
public class AsignaturaPasantia extends AsignaturaNoPromocional {

    /**
     * @param codigo       Código único de la asignatura.
     * @param nombre       Nombre de la asignatura.
     * @param cuatrimestre Cuatrimestre en que se dicta (1 a 10).
     */
    public AsignaturaPasantia(String codigo, String nombre, int cuatrimestre) {
        super(codigo, nombre, cuatrimestre, CategoriaAsignatura.PASANTIA);
    }

    /**
     * @return 75.0 — porcentaje mínimo para habilitar.
     */
    @Override
    public double porcentajeHabilitacion() {
        return 75.0;
    }
}
