/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.controller;

import br.gov.pr.escola.backend.entity.AmbulatorioEntity;
import br.gov.pr.escola.backend.service.AmbulatorioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrador
 */
@RestController
public class AmbulatorioController {
    
    @Autowired
    private AmbulatorioService service;
    
    //Mudar para /api/v1/ambulatorios - pois essa e a primeira versao de API
    @GetMapping("/api/ambulatorios/todos")
    public ResponseEntity<List<AmbulatorioEntity>> findAll() {
        List<AmbulatorioEntity> ambulatorios
                = this.service.findAll();
        
        return new ResponseEntity<List<AmbulatorioEntity>>(ambulatorios, HttpStatus.OK);
    }
    
    
    
}
