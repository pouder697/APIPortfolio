/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Skills;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Andres
 */
public interface ISkillsService {
    public List<Skills> getAll();
    
    public ResponseEntity<Skills> getById(int id);
    
    public Skills save(Skills skills);
    
    public void delete (int id);
    
}
