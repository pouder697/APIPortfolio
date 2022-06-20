/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Educacion;
import com.example.demo.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres
 */


@RestController
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired
    public IEducacionService educacionService;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> getAll(){
        return educacionService.getAll();
    }
    
      @GetMapping("/{id}")
    public ResponseEntity<Educacion> getEducacionById(@PathVariable(value = "id") int id) {
        return educacionService.getById(id);
    }

    @PostMapping("/new")
    public String crearEducacion(@RequestBody Educacion educacion) {
        educacionService.save(educacion);
        return "La educación fue añadida con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Educacion> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Educacion educacion) {
        if (id == educacion.getIdeducacion()) {
            Educacion educacionNew = educacionService.save(educacion);
            return ResponseEntity.ok().body(educacionNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEducacion(@PathVariable(value = "id") int id) {
        educacionService.delete(id);
        return "La educación ha sido eliminada con éxito";
    }
}
