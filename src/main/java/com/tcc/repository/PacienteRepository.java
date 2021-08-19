package com.tcc.repository;

import com.tcc.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>  {

        Optional<Paciente> findAllByNome(String nome);
        Optional<Paciente> findByNomeContaining(String nome);
        Optional<Paciente> findById(int pacienteId);
}
