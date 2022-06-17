/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Experiencia;
import com.example.demo.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> getAll() {
        return (List<Experiencia>) experienciaRepository.findAll();
    }

    @Override
    public ResponseEntity<Experiencia> getById(int id) {
        Optional<Experiencia> experiencia = experienciaRepository.findById(id);
        if (experiencia.isPresent()) {
            return ResponseEntity.ok().body(experiencia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public Experiencia save(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public void delete(int id) {
        experienciaRepository.deleteById(id);
    }

}
