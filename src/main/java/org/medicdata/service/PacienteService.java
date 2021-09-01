package org.medicdata.service;

import org.medicdata.model.Paciente;
import org.medicdata.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public Paciente save (Paciente paciente){
        return repository.save(paciente);
    }

    public Optional<Paciente> getById(Long id){
        return repository.findById(id);
    }


    public Optional<Paciente> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
         repository.deleteById(id);
    }

    public List<Paciente> findAll() {
        return repository.findAll();
    }

    public Paciente atualizarPorId(Long id, Paciente paciente) {
        Optional<Paciente> buscaPaciente = repository.findById(id);
        if (buscaPaciente.isPresent()){
          repository.save(atualizarDadosDoPaciente(paciente, buscaPaciente.get()));
        }
        return buscaPaciente.get();
    }

    private Paciente atualizarDadosDoPaciente(Paciente paciente, Paciente pacienteSalvo) {
        pacienteSalvo.setAltura(paciente.getAltura());
        pacienteSalvo.setNome(paciente.getNome());
        pacienteSalvo.setPeso(paciente.getPeso());
        pacienteSalvo.setDiagnostico(paciente.getDiagnostico());
        return pacienteSalvo;
    }
}
