
package ec.edu.espe.arquitectura.prueba.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class UsuarioEspacioPK implements Serializable {
    
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codEspacio, Integer codUsuario) {
        this.codEspacio = codEspacio;
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codEspacio);
        hash = 83 * hash + Objects.hashCode(this.codUsuario);
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
        final UsuarioEspacioPK other = (UsuarioEspacioPK) obj;
        if (!Objects.equals(this.codEspacio, other.codEspacio)) {
            return false;
        }
        if (!Objects.equals(this.codUsuario, other.codUsuario)) {
            return false;
        }
        return true;
    }
}
