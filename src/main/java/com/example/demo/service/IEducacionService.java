/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.model.Proyecto;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Andres
 */
public interface IEducacionService {
    
    public List<Educacion> getAll();
    
    public ResponseEntity<Educacion> getById(int id);
    
    public Educacion save(Educacion educacion);
    
    public void delete(int id);
}
