/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;
import org.springframework.http.ResponseEntity;


/**
 *
 * @author Andres
 */
public interface IPersonaService {
    
    public List<Persona> getAll();
    
    public ResponseEntity<Persona> getById(int id);
    
    public Persona getByUsername(String username);
    
    public Persona save(Persona persona);
    
    public void delete(int id);
}
