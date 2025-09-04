/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.ConsultaEntity;
import br.gov.pr.escola.backend.repository.ConsultaRepository;
import br.gov.pr.escola.backend.util.IBaseService;
import java.sql.Time;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class ConsultaService implements IBaseService<ConsultaEntity> {

    @Autowired
    private ConsultaRepository repository;
    
    @Override
    public List<ConsultaEntity> findAll() {
        return this.repository.findAll();
    }

    @Override
    public ConsultaEntity getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public ConsultaEntity save(ConsultaEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
    //public List<ConsultaEntity> buscarTodasConsultasTarde() {
    //    return this.repository.buscarTodasConsultasTarde();
    //}
    
    public List<ConsultaEntity> buscarTodasConsultasTarde(Time horaInicial, Time horaFinal) {
        return this.repository.buscarTodasConsultasTarde(horaInicial, horaFinal);
    }
    
}
