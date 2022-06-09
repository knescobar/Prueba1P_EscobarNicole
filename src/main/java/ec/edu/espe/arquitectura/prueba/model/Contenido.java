
package ec.edu.espe.arquitectura.prueba.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gdc_contenido")
public class Contenido   implements Serializable{
    private static final long serialVersionUID = 1585458L;
    @Id
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    @JoinColumns({
        @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false)})
    @ManyToOne(optional = false)
    private Espacio espacio;
    @JoinColumns({
        @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_materia", nullable = false)})
    @ManyToOne(optional = false)
    private Contenido contenido;

    public Contenido() {
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codContenido);
        hash = 67 * hash + Objects.hashCode(this.espacio);
        hash = 67 * hash + Objects.hashCode(this.contenido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contenido other = (Contenido) obj;
        if (!Objects.equals(this.codContenido, other.codContenido)) {
            return false;
        }
        if (!Objects.equals(this.espacio, other.espacio)) {
            return false;
        }
        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        return true;
    }

}
