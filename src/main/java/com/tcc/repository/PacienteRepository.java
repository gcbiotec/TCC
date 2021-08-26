package com.tcc.repository;

import java.util.Optional;
import com.tcc.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>  {

      Optional<Paciente> findByNomeContaining(String nome);
//
//        @Override
//        Optional<Paciente> findById(Long pacienteId);

}
