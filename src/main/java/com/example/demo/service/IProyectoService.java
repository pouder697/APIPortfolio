/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Proyecto;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Andres
 */
public interface IProyectoService {
    
    public List<Proyecto> getAll();
    
    public ResponseEntity<Proyecto> getById(int id);
    
    public Proyecto save(Proyecto proyecto);
    
    public void delete(int id);
}
