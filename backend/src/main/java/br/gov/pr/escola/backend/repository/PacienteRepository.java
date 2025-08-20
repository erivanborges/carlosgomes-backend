/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {
    
    @Query("SELECT p FROM PacienteEntity p WHERE p.id = ?1")
    PacienteEntity getById(Long id);
    
    //@Query("SELECT p FROM PacienteEntity p WHERE p.id = :id")
    //PacienteEntity getById(Long id);
    
    //@Query(name = "SELECT * FROM paciente WHERE id = ?1", nativeQuery = true)
    //PacienteEntity getById(Long id);
    
    
}
