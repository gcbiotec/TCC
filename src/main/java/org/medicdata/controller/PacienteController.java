package org.medicdata.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.medicdata.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.medicdata.service.PacienteService;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@Tag(name = "paciente")
public class PacienteController {

    @Autowired
    public PacienteService pacienteService;

    @PostMapping(value = "/pacientes", produces = "application/json")
    public ResponseEntity<?> criarPaciente(@Valid @RequestBody Paciente paciente) {
        try {
            pacienteService.save(paciente);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @DeleteMapping(value = "/pacientes/{id}")
    public ResponseEntity<?> deletarPaciente(@PathVariable(value = "id") Long id ) {
        try {
            pacienteService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @GetMapping(value = "/pacientes")
    public ResponseEntity<List<Paciente>> listarTodosPacientes() {
        try {
            return new ResponseEntity(pacienteService.findAll(), HttpStatus.OK);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @GetMapping(value = "/pacientes/{id}/")
    public ResponseEntity<List<Paciente>> listarRegistrosPorId(@PathVariable(value = "id") Long id ) {
        try {
            return new ResponseEntity(pacienteService.listById(id), HttpStatus.OK);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping(value = "/pacientes/{id}")
    public ResponseEntity<?> encontraPacientePorId(@PathVariable(value = "id") Long id ) {
        try {
            Optional<Paciente> paciente = pacienteService.findById(id);
            if (paciente.isPresent()) {
                return ResponseEntity.status(HttpStatus.OK).body(paciente.get());
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping(value = "/pacientes/{id}")
    public ResponseEntity<?> atualizarPacientePorId(@Valid @RequestBody Paciente paciente, @PathVariable(value = "id") Long id ) {
        try {
            Paciente pacienteAtualizado = pacienteService.atualizarPorId(id, paciente);

            return ResponseEntity.status(HttpStatus.OK).body(pacienteAtualizado);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

}
