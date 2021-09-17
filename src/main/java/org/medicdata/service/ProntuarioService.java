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
            prontuarioRepository.save(atualizarProntuario(prontuario, buscaProntuario.get()));
        }
        return buscaProntuario.get();
    }

    private Prontuario atualizarProntuario(Prontuario prontuarioComDadosNovos, Prontuario prontuarioSalvoNaBase) {
        prontuarioSalvoNaBase.setAlbumina(prontuarioComDadosNovos.getAlbumina());
        prontuarioSalvoNaBase.setAlcoolismo(prontuarioComDadosNovos.getAlcoolismo());
        prontuarioSalvoNaBase.setCkmb(prontuarioComDadosNovos.getCkmb());
        prontuarioSalvoNaBase.setCreatinina(prontuarioComDadosNovos.getCreatinina());
        prontuarioSalvoNaBase.setComorbidades(prontuarioComDadosNovos.getComorbidades());
        prontuarioSalvoNaBase.setDiabetes(prontuarioComDadosNovos.getDiabetes());
        prontuarioSalvoNaBase.setGlicose(prontuarioComDadosNovos.getGlicose());
        prontuarioSalvoNaBase.setFumante(prontuarioComDadosNovos.getFumante());
        prontuarioSalvoNaBase.setHDL(prontuarioComDadosNovos.getHDL());
        prontuarioSalvoNaBase.setLDL(prontuarioComDadosNovos.getLDL());
        prontuarioSalvoNaBase.setHemoglobina(prontuarioComDadosNovos.getHemoglobina());
        prontuarioSalvoNaBase.setTroponina(prontuarioComDadosNovos.getTroponina());
        prontuarioSalvoNaBase.setHipertensao(prontuarioComDadosNovos.getHipertensao());
        prontuarioSalvoNaBase.setIdade(prontuarioComDadosNovos.getIdade());
        prontuarioSalvoNaBase.setLeucocitos(prontuarioComDadosNovos.getLeucocitos());
        prontuarioSalvoNaBase.setNeutrofilos(prontuarioComDadosNovos.getNeutrofilos());


        // reencher com as outras propriedades
        return prontuarioSalvoNaBase;
    }

}
