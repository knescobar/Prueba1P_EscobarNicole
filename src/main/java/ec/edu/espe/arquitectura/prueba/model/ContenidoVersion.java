
package ec.edu.espe.arquitectura.prueba.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codespacio;
    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;
    @Column(name = "nombre_archivo", nullable = false, length = 64)
    private String nombreArchivo;
    @Column(name = "tamanio", precision = 9, scale = 0)
    private BigDecimal tamanio;
    @Column(name = "version", precision = 4, scale = 2)
    private BigDecimal version;
    @Column(name = "comentario", nullable = false, length = 500)
    private String comenrario;
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "cod_modulo", referencedColumnName = "cod_modulo", nullable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;
 
 
    public ContenidoVersion() {
    }

    public Integer getCodespacio() {
        return codespacio;
    }

    public void setCodespacio(Integer codespacio) {
        this.codespacio = codespacio;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getComenrario() {
        return comenrario;
    }

    public void setComenrario(String comenrario) {
        this.comenrario = comenrario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.codespacio);
        hash = 71 * hash + Objects.hashCode(this.hashArchivo);
        hash = 71 * hash + Objects.hashCode(this.nombreArchivo);
        hash = 71 * hash + Objects.hashCode(this.tamanio);
        hash = 71 * hash + Objects.hashCode(this.version);
        hash = 71 * hash + Objects.hashCode(this.comenrario);
        hash = 71 * hash + Objects.hashCode(this.fechaCreacion);
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
        final ContenidoVersion other = (ContenidoVersion) obj;
        if (!Objects.equals(this.hashArchivo, other.hashArchivo)) {
            return false;
        }
        if (!Objects.equals(this.nombreArchivo, other.nombreArchivo)) {
            return false;
        }
        if (!Objects.equals(this.comenrario, other.comenrario)) {
            return false;
        }
        if (!Objects.equals(this.codespacio, other.codespacio)) {
            return false;
        }
        if (!Objects.equals(this.tamanio, other.tamanio)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        return true;
    }

}
