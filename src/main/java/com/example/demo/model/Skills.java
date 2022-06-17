/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idskills;

    private String titulo;
    private int dominio;
    private int persona;

    public Skills() {

    }

    public Skills(String titulo, int dominio) {
        this.titulo = titulo;
        this.dominio = dominio;
    }

    public Skills(int idskill, String titulo, int dominio, int persona) {
        this.idskills = idskill;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "idskill=" + idskills +
                ", titulo=" + titulo +
                ", dominio=" + dominio +
                ", persona=" + persona + '}';
    }
}