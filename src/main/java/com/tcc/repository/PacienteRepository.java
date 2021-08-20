package com.tcc.repository;

import com.tcc.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>  {

        Optional<Paciente> findByNomeContaining(String nome);
        Optional<Paciente> findById(Integer pacienteId);

}
