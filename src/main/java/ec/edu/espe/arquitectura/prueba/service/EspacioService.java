/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.prueba.service;

import ec.edu.espe.arquitectura.prueba.dao.EspacioRepository;
import ec.edu.espe.arquitectura.prueba.model.Espacio;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicol
 */
@Service
public class EspacioService {
    private EspacioRepository espacioRepository;

    public EspacioService(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }
     public List<Espacio> obtenerSitiosUsuario(Integer codUsuario) {
        return this.espacioRepository.findByUsuarioCodusuario(codUsuario);
    }
    
}
