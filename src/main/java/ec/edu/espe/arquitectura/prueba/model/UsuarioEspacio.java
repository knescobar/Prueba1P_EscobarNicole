package ec.edu.espe.arquitectura.prueba.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio  implements Serializable {
    private static final long serialVersionUID = 46545582L;
    @EmbeddedId
    private UsuarioEspacioPK pk;
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.pk);
        hash = 47 * hash + Objects.hashCode(this.estado);
        hash = 47 * hash + Objects.hashCode(this.espacio);
        hash = 47 * hash + Objects.hashCode(this.usuario);
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
        final UsuarioEspacio other = (UsuarioEspacio) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        if (!Objects.equals(this.espacio, other.espacio)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

  
   
}
