/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.prueba.resource;

import ec.edu.espe.arquitectura.prueba.model.Espacio;
import ec.edu.espe.arquitectura.prueba.service.EspacioService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nicol
 */
@RestController
@RequestMapping(path = "/espacio")
public class EspacioResource {
    private EspacioService espacioService;

    public EspacioResource(EspacioService espacioService) {
        this.espacioService = espacioService;
    }
    
    @GetMapping
    public ResponseEntity<List<Espacio>> getPerfilActivos(Integer codUsuario){
        return ResponseEntity.ok(this.espacioService.obtenerSitiosUsuario(codUsuario));
    }
}
