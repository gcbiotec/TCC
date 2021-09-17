package org.medicdata.repository;
import org.medicdata.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Override
    <S extends Paciente> S save(S entity);

    @Override
    Optional<Paciente> findById(Long id);

    @Query(value="SELECT * FROM prontuario WHERE idpaciente = :id", nativeQuery=true)
    List<Paciente> listById(Long id);
}
