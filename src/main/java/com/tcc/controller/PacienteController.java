package com.tcc.controller;

import com.tcc.domain.Paciente;
import com.tcc.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


    @CrossOrigin
    @RestController
    @RequestMapping("/pacientes")
    public class PacienteController {

        @Autowired
        private PacienteRepository pacienteRepository;

        @GetMapping("{id}")
        public ResponseEntity<Paciente> retornaPaciente(@PathVariable("id") int pacienteId) {
            Optional<Paciente> resultado = pacienteRepository.findById(pacienteId);

            if (resultado.isPresent()) {
                return new ResponseEntity<Paciente>(resultado.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<Paciente>(HttpStatus.NO_CONTENT);
            }
        }

        @GetMapping
        public ResponseEntity<List<Paciente>> findAllByNome(@RequestParam(value = "nome", required = false) String nome) {
            List<Paciente> resultado;

            // validar nome
            if (nome != null) {
                Optional<Paciente> paciente = pacienteRepository.findByNomeContaining(nome);

                if (paciente.isPresent()) {
                    resultado = Collections.singletonList(paciente.get());
                } else {
                    resultado = Collections.emptyList();
                }
            } else {
                resultado = pacienteRepository.findAll();
            }

            return new ResponseEntity(resultado, HttpStatus.OK);
        }

        @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity salvaPaciente(@RequestBody Paciente paciente) {
            pacienteRepository.save(paciente);

            return ResponseEntity.ok().build();
        }

            // Aqui estava Patching

        @DeleteMapping(value = "{id}")
        public ResponseEntity deletePacienteById(@PathVariable int pacienteId) {
            Optional<Paciente> pacienteFromDB = pacienteRepository.findById(pacienteId);

            if (pacienteFromDB.isPresent()) {
                Paciente paciente = pacienteFromDB.get();

                pacienteRepository.delete(paciente);

                return new ResponseEntity(HttpStatus.OK);

            } else {
                return new ResponseEntity(HttpStatus.BAD_REQUEST);
            }
        }
    }
