/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.ConsultaEntity;
import java.sql.Time;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaEntity, Long> {
    
    @Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN {t '14:00:00'} AND {t '18:00:00'}")
    List<ConsultaEntity> buscarTodasConsultasTarde(); 
    
    //@Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN ?1 AND ?2")
    //List<ConsultaEntity> buscarTodasConsultasTarde(Time horaInicial, Time horaFinal);
    
    @Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN :hrInicial AND :hrFinal")
    List<ConsultaEntity> buscarTodasConsultasTarde(@Param("hrInicial") Time horaInicial, @Param("hrFinal") Time horaFinal);
    
}
