/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Proyecto;
import com.example.demo.service.IProyectoService;
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
 * @author Andres    Proyecto proyecto
 */

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
    
    @Autowired
    public IProyectoService proyectoService;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> getAllProyectos() {
        return proyectoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> getProyectoById(@PathVariable(value = "id") int id) {
        return proyectoService.getById(id);
    }

    @PostMapping("/new")
    public String crearProyecto(@RequestBody Proyecto persona) {
        proyectoService.save(persona);
        return "La persona fue creada con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Proyecto> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Proyecto proyecto) {
        if (id == proyecto.getIdproyecto()) {
            Proyecto proyectoNew = proyectoService.save(proyecto);
            return ResponseEntity.ok().body(proyectoNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteProyecto(@PathVariable(value = "id") int id) {
        proyectoService.delete(id);
        return "La persona ha sido eliminada con éxito";
    }
}
    

