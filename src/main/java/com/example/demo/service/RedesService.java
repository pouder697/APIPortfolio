/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Redes;
import com.example.demo.repository.RedesRepository;
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
public class RedesService implements IRedesService{

    @Autowired
    public RedesRepository redesRepository;
    
    @Override
    public List<Redes> getAll() {
        return (List<Redes>) redesRepository.findAll();
    }

    @Override
    public ResponseEntity<Redes> getById(int id) {
       Optional<Redes> redes = redesRepository.findById(id);
       if(redes.isPresent()){
           return ResponseEntity.ok().body(redes.get());
       }else{
           return ResponseEntity.notFound().build();
       }
    }

    @Override
    public Redes save(Redes redes) {
        return redesRepository.save(redes);
    }

    @Override
    public void delete(int id) {
        redesRepository.deleteById(id);
    }
}
