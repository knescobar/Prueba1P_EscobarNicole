/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.prueba.service;

import ec.edu.espe.arquitectura.prueba.dao.EspacioRepository;
import ec.edu.espe.arquitectura.prueba.dao.UsuarioEspacioRepository;
import ec.edu.espe.arquitectura.prueba.dao.UsuarioRepository;
import ec.edu.espe.arquitectura.prueba.model.Usuario;
import ec.edu.espe.arquitectura.prueba.model.UsuarioEspacio;
import ec.edu.espe.arquitectura.prueba.model.UsuarioEspacioPK;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicol
 */
@Service
public class UsuarioService {
     private UsuarioRepository usuarioRepository;
 private EspacioRepository espacioRepository;
private UsuarioEspacioRepository usuarioEspacioRepository;
private UsuarioEspacioPK  usuarioEspaciopk;
    public UsuarioService(UsuarioRepository usuarioRepository, EspacioRepository espacioRepository, UsuarioEspacioRepository usuarioEspacioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.espacioRepository = espacioRepository;
        this.usuarioEspacioRepository = usuarioEspacioRepository;
    }

   
    
    public void agregarUsuario(Integer codSitio, Integer codUsuario){ 
    }
    
     
}
