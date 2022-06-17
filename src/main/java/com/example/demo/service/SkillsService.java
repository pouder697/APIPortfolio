
package com.example.demo.service;

import com.example.demo.model.Skills;
import com.example.demo.repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skillsRepository;

    @Override
    public List<Skills> getAll() {
      return (List<Skills>) skillsRepository.findAll();
    }

    @Override
    public ResponseEntity<Skills> getById(int id) {
        Optional<Skills> skills = skillsRepository.findById(id);
        if(skills.isPresent()){
            return ResponseEntity.ok().body(skills.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public Skills save(Skills skills) {
        return skillsRepository.save(skills);
    }

    @Override
    public void delete(int id) {
        skillsRepository.deleteById(id);
    }
    
}

