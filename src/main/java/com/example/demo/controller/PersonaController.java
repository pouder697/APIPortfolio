package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
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
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    @ResponseBody
    public List<Persona> getAllPersonas() {
        return personaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable(value = "id") int id) {
        return personaService.getById(id);
    }

    @PostMapping("/new")
    public String crearPersona(@RequestBody Persona persona) {
        personaService.save(persona);
        return "La persona fue creada con éxito";

    }

    @PutMapping("/save/{id}")
     public ResponseEntity<Persona> update(@PathVariable(value = "id") int id,
            @Validated @RequestBody Persona persona) {
        if (id == persona.getIdpersona()) {
            Persona personaNew = personaService.save(persona);
            return ResponseEntity.ok().body(personaNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable(value = "id") int id) {
        personaService.delete(id);
        return "La persona ha sido eliminada con éxito";
    }
}
