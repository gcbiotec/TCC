package org.medicdata.service;


import org.medicdata.model.Prontuario;
import org.medicdata.repository.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public List<Prontuario> findByPaciente(Long idPaciente) {
        List<Prontuario> prontuarios = prontuarioRepository.findByPaciente(idPaciente);
        return prontuarios;
    }

}
