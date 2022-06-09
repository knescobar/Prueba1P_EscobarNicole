/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.prueba.dao;

import ec.edu.espe.arquitectura.prueba.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nicol
 */
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{
    
}
