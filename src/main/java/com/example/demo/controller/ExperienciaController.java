/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Experiencia;
import com.example.demo.service.IExperienciaService;
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


@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService experienciaService;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> getAllExperiencia() {
        return experienciaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experiencia> getExperienciaById(@PathVariable(value = "id") int id) {
        return experienciaService.getById(id);
    }

    @PostMapping("/new")
    public String crearExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.save(experiencia);
        return "La persona fue creada con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Experiencia> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Experiencia experiencia) {
        if (id == experiencia.getIdexperiencia()) {
            Experiencia experienciaNew = experienciaService.save(experiencia);
            return ResponseEntity.ok().body(experienciaNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteExperiencia(@PathVariable(value = "id") int id) {
        experienciaService.delete(id);
        return "La persona ha sido eliminada con éxito";
    }
    
}