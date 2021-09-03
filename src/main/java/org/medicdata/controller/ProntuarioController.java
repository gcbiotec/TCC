package org.medicdata.controller;

import org.medicdata.model.Paciente;
import org.medicdata.service.ProntuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;
import java.util.List;

public class ProntuarioController {

    private ProntuarioService prontuarioService;

    @GetMapping(value = "/pacientes/{idPaciente}/prontuarios")
    public ResponseEntity<List<Paciente>> listarProntuariosPorPaciente(@PathVariable(value = "idPaciente") Long idPaciente) {
        try {
            return new ResponseEntity(prontuarioService.findByPaciente(idPaciente), HttpStatus.OK);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
