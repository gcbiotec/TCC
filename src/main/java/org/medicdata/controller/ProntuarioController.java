package org.medicdata.controller;

import org.medicdata.model.Paciente;
import org.medicdata.model.Prontuario;
import org.medicdata.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin
@RestController
public class ProntuarioController {
    @Autowired
    private ProntuarioService prontuarioService;

    @GetMapping(value = "/pacientes/{idPaciente}/prontuarios")
    public ResponseEntity<List<Paciente>> listarProntuariosPorPaciente(@PathVariable(value = "idPaciente") Long idPaciente) {
        try {
            return new ResponseEntity(prontuarioService.findByIdPaciente(idPaciente), HttpStatus.OK);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PostMapping(value = "/prontuarios")
    public ResponseEntity<?> criarProntuario(@Valid @RequestBody Prontuario prontuario) {
        try {
            prontuarioService.save(prontuario);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @DeleteMapping(value = "/prontuarios/{id}")
    public ResponseEntity<?> deletarProntuario(@PathVariable(value = "id") Long id ) {
        try {
            prontuarioService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping(value = "/prontuarios/{id}")
    public ResponseEntity<?> atualizarProntuarioporId(@Valid @RequestBody Prontuario prontuario, @PathVariable(value = "id") Long id ) {
        try {
            Prontuario prontuarioAtualizado = prontuarioService.atualizarProntuarioPorId(id, prontuario);

            return ResponseEntity.status(HttpStatus.OK).body(prontuarioAtualizado);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }


}
