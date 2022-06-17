/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Redes;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Andres
 */
public interface IRedesService {
   
    public List<Redes> getAll();
    
    public ResponseEntity<Redes> getById(int id);
    
    public Redes save(Redes redes);
    
    public void delete(int id);
    
}
