/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Experiencia;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Andres
 */
public interface IExperienciaService {
    
    public List<Experiencia> getAll();
    
    public ResponseEntity<Experiencia> getById(int id);
    
    public Experiencia save (Experiencia experiencia);
    
    public void delete(int id);
    
}
