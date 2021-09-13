package org.medicdata.repository;

import org.medicdata.model.Paciente;
import org.medicdata.model.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
@Query("select p from Prontuario p where p.idpaciente = :idpaciente")
    List<Prontuario> findByIdPaciente(@Param("idpaciente") Long idpaciente);

    @Override
    <S extends Prontuario> S save(S entity);
}
