/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.AmbulatorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface AmbulatorioRepository extends JpaRepository<AmbulatorioEntity, Long> {
    
    @Query("SELECT a FROM AmbulatorioEntity a WHERE a.id = ?1")
    AmbulatorioEntity getById(Long id);
    
}
