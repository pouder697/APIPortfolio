/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.repository.EducacionRepository;
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
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getAll() {
        return (List<Educacion>) educacionRepository.findAll();
    }

    @Override
    public ResponseEntity<Educacion> getById(int id) {

        Optional<Educacion> educacion = educacionRepository.findById(id);

        if (educacion.isPresent()) {
            return ResponseEntity.ok().body(educacion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public Educacion save(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    @Override
    public void delete(int id) {
        educacionRepository.deleteById(id);
    }
}