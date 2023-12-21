package ec.edu.espe.examen.Jaramillo.domain;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "ASIGNATURA")
public class Asignatura {
    @Id    
    @Column(name = "COD_ASIGNATURA", nullable = false, length = 10)
    private String codigo;

    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Column(name = "CREDITOS", nullable = false, length = 1)
    private Integer creditos;

    @OneToMany(mappedBy = "asignatura")
    private Set<AlumnoAsignatura> alumnoAsignaturas;

    @Version
    private Long version;

    public Asignatura() {
    }

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Set<AlumnoAsignatura> getAlumnoAsignaturas() {
        return alumnoAsignaturas;
    }

    public void setAlumnoAsignaturas(Set<AlumnoAsignatura> alumnoAsignaturas) {
        this.alumnoAsignaturas = alumnoAsignaturas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asignatura other = (Asignatura) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", alumnoAsignaturas="
                + alumnoAsignaturas + "]";
    }
}
