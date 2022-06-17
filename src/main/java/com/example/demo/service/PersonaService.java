package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public ResponseEntity<Persona> getById(int id) {

        Optional<Persona> persona = personaRepository.findById(id);

        if (persona.isPresent()) {
            return ResponseEntity.ok().body(persona.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @Override
    public Persona getByUsername(String username) {
        return personaRepository.findByUsername(username);
    }
    
    @Override
    public Persona save(Persona persona) {
      return personaRepository.save(persona);
    }

    @Override
    public void delete(int id) {
        personaRepository.deleteById(id);
    }

}
