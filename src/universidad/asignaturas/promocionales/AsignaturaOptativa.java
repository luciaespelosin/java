package universidad.asignaturas.promocionales;

import universidad.asignaturas.CategoriaAsignatura;

/**
 * Asignatura optativa y promocional.
 * Requiere 50% de asistencia para habilitar y 60% para promocionar.
 */
public class AsignaturaOptativa extends AsignaturaPromocional {

    /**
     * @param codigo       Código único de la asignatura.
     * @param nombre       Nombre de la asignatura
     * @param cuatrimestre Cuatrimestre en que se dicta
     */
    public AsignaturaOptativa(String codigo, String nombre, int cuatrimestre) {
        super(codigo, nombre, cuatrimestre, CategoriaAsignatura.OPTATIVA);
    }

    /**
     * @return 50.0 — porcentaje mínimo para habilitar.
     */
    @Override
    public double porcentajeHabilitacion() {
        return 50.0;
    }

    /**
     * @return 60.0 — porcentaje mínimo para promocionar.
     */
    @Override
    public double porcentajePromocion() {
        return 60.0;
    }
}