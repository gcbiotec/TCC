package org.medicdata.service;

import org.medicdata.model.Paciente;
import org.medicdata.model.Prontuario;
import org.medicdata.repository.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public ProntuarioService(ProntuarioRepository prontuarioRepository) {
        this.prontuarioRepository = prontuarioRepository;
    }

    public List<Prontuario> findByIdPaciente(Long idPaciente) {
        List<Prontuario> prontuarios = prontuarioRepository.findByIdPaciente(idPaciente);
        return prontuarios;
    }
    public Prontuario save (Prontuario prontuario){
        return prontuarioRepository.save(prontuario);
    }

    public void delete(Long id) {
        prontuarioRepository.deleteById(id);
    }

    public Prontuario atualizarProntuarioPorId(Long id, Prontuario prontuario){
        Optional<Prontuario> buscaProntuario = prontuarioRepository.findById(id);
        if (buscaProntuario.isPresent()){
            prontuarioRepository.save(atualizarProntuarioPorId(id, buscaProntuario.get()));
        }
        return buscaProntuario.get();
    }

}
