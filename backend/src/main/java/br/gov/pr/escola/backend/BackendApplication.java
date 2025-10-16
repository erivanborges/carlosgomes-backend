package br.gov.pr.escola.backend;

import br.gov.pr.escola.backend.entity.CidadeEntity;
import br.gov.pr.escola.backend.entity.ConsultaEntity;
import br.gov.pr.escola.backend.entity.PacienteEntity;
import br.gov.pr.escola.backend.service.CidadeService;
import br.gov.pr.escola.backend.service.ConsultaService;
import br.gov.pr.escola.backend.service.FuncionarioService;
import br.gov.pr.escola.backend.service.PacienteService;
import java.sql.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {
    
        private static final Logger log = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner lineRunner(CidadeService cidadeService, PacienteService pacienteService, ConsultaService consultaService) {
            
            return (arg) -> {
                
                /*CidadeEntity cidade = new CidadeEntity();
                
                cidade.setNome("Pato Branco");
                cidade.setUf("PR");
                
                log.info("");
                log.info("=====================================");
                log.info("Salvando dados na tabela cidade");
                log.info("=====================================");
                log.info("");
                
                cidadeService.save(cidade);
                
                log.info("");
                log.info("");
                log.info("============ Listagem de todos os pacientes ==============");
                log.info("");
                for (CidadeEntity c: cidadeService.findAll()) {
                    log.info("Nome.......: " + c.getNome());
                    log.info("UF......: " + c.getUf());
                    log.info("");
                }
                
                log.info("Dados na tabela cidade salvo com sucesso!");
                
                log.info("");
                log.info("");
                log.info("============ Listagem de todos os pacientes ==============");
                log.info("");
                for (PacienteEntity p: pacienteService.findAll()) {
                    log.info("Nome.......: " + p.getNome());
                    log.info("Idade......: " + p.getIdade());
                    log.info("Doença.....: " + p.getDoenca());
                    log.info("CPF........: " + p.getCpf());
                    log.info("Cidade.....: " + p.getCidade().getNome());
                    log.info("");
                }*/
                
                /*
                log.info("");
                log.info("");
                log.info("============ Listagem do paciente ==============");
                log.info("");
                
                //PacienteEntity p = pacienteService.getById(Long.parseLong("4"));
                
                PacienteEntity p = pacienteService.getById(4l);
                
                log.info("Nome do Paciente: " + p.getNome());
                log.info("Idade: " + p.getIdade());
                log.info("Doença: " + p.getDoenca());
                
                
                log.info("");
                log.info("");
                log.info("============ Deletando paciente ==============");
                log.info("");
                
                pacienteService.deleteById(4l);*/
                
                /*log.info("");
                log.info("");
                log.info("============ Listagem as consultas somente do periodo da tarde sem parametros ==============");
                log.info("");
                
                for (ConsultaEntity consulta : consultaService.buscarTodasConsultasTarde()) {
                    log.info("ID da consulta: " + consulta.getId());
                    log.info("Data da consulta: " + consulta.getData());
                    log.info("Hora da consulta: " + consulta.getHora());
                    log.info("Medico: " + consulta.getMedico().getNome());
                    log.info("Paciente: " + consulta.getPaciente().getNome());
                    log.info("");
                }
                */
                
                /*log.info("");
                log.info("");
                log.info("============ Listagem as consultas somente do periodo da tarde com parametros posicionais ==============");
                log.info("");
                
                for (ConsultaEntity consulta : consultaService.buscarTodasConsultasTarde(new Time(14,0,0), new Time(18,0,0))) {
                    log.info("ID da consulta: " + consulta.getId());
                    log.info("Data da consulta: " + consulta.getData());
                    log.info("Hora da consulta: " + consulta.getHora());
                    log.info("Medico: " + consulta.getMedico().getNome());
                    log.info("Paciente: " + consulta.getPaciente().getNome());
                    log.info("");
                }*/
                
            };
        }

}
