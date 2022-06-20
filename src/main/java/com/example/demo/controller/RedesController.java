/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Redes;
import com.example.demo.service.IRedesService;
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
@RequestMapping("/redes")
public class RedesController {
    
    @Autowired
    public IRedesService redesService;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Redes> getAllSkills() {
        return redesService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Redes> getSkillsById(@PathVariable(value = "id") int id) {
        return redesService.getById(id);
    }

    @PostMapping("/new")
    public String crearSkills(@RequestBody Redes redes) {
        redesService.save(redes);
        return "La persona fue creada con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Redes> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Redes redes) {
        if (id == redes.getIdredes()) {
            Redes redesNew = redesService.save(redes);
            return ResponseEntity.ok().body(redesNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteSkills(@PathVariable(value = "id") int id) {
        redesService.delete(id);
        return "La persona ha sido eliminada con éxito";
    }
}