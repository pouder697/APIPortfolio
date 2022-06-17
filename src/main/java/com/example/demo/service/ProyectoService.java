/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Proyecto;
import com.example.demo.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> getAll() {
        return (List<Proyecto>) proyectoRepository.findAll();
    }

    @Override
    public ResponseEntity<Proyecto> getById(int id) {

        Optional<Proyecto> proyecto = proyectoRepository.findById(id);

        if (proyecto.isPresent()) {
            return ResponseEntity.ok().body(proyecto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public Proyecto save(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public void delete(int id) {
        proyectoRepository.deleteById(id);
    }

}
