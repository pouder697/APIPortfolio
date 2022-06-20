/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Skills;
import com.example.demo.service.ISkillsService;
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
@RequestMapping("/skills")
public class SkillsController {
    
    @Autowired
    public ISkillsService skillsService;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Skills> getAllSkills() {
        return skillsService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skills> getSkillsById(@PathVariable(value = "id") int id) {
        return skillsService.getById(id);
    }

    @PostMapping("/new")
    public String crearSkills(@RequestBody Skills skills) {
        skillsService.save(skills);
        return "La persona fue creada con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Skills> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Skills skills) {
        if (id == skills.getIdskills()) {
            Skills skillsNew = skillsService.save(skills);
            return ResponseEntity.ok().body(skillsNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteSkills(@PathVariable(value = "id") int id) {
        skillsService.delete(id);
        return "La persona ha sido eliminada con éxito";
    }
}