package universidad.asignaturas;

import java.io.Serializable;
import java.util.Objects;
import java.io.Serial;
import universidad.excepciones.*;
import java.util.Objects;

public abstract class Asignatura implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String codigo;
    private String nombre;
    private int cuatrimestre;
    private boolean promocional;
    private CategoriaAsignatura categoria; 

    public Asignatura(String codigo, String nombre, int cuatrimestre, boolean promocional, CategoriaAsignatura categoria) {
        if (cuatrimestre < 1 || cuatrimestre > 10) {
            throw new DatoInvalidoException("Cuatrimestre inválido");
        }
        if (codigo == null || codigo.isBlank()) {
            throw new ParametroNuloException("El código de la asignatura no puede estar vacío");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new ParametroNuloException("El nombre de la asignatura no puede estar vacío");
        }
        if (categoria == null) {
            throw new ParametroNuloException("La categoría de la asignatura no puede ser nula");
        }
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.promocional = promocional;
        this.categoria = categoria;
    }
    public String getCodigo() {
        return codigo; 
    }
    public void setCodigo(String codigo) { 
        if (codigo == null || codigo.isBlank()) {
            throw new ParametroNuloException("El código no puede estar vacío");
        }
        this.codigo = codigo; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        if (nombre == null || nombre.isBlank()) {
            throw new ParametroNuloException("El nombre no puede estar vacío");
        }
        this.nombre = nombre; 
    }
    public int getCuatrimestre() { 
        return cuatrimestre; 
    }
    public void setCuatrimestre(int cuatrimestre) { 
        if (cuatrimestre < 1 || cuatrimestre > 10) {
            throw new DatoInvalidoException("Cuatrimestre inválido");
        }
        this.cuatrimestre = cuatrimestre; 
    }
    public boolean isPromocional() { 
        return promocional; 
    }
    public CategoriaAsignatura getCategoria() { 
        return categoria; 
    }
    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " - " + categoria;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura otra = (Asignatura) o;
        return this.codigo.equalsIgnoreCase(otra.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo != null ? codigo.toLowerCase() : null);
    }
    public abstract double porcentajeHabilitacion(); // abstracta
    public abstract double porcentajePromocion(); // abstracta
}