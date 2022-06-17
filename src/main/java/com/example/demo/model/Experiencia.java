/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.Date;
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
@Table(name="experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idexperiencia;

    private String puesto;
    private String descripcion;
    private String empresa;
    private Date inicio;
    private Date fin;
    private String fotourl;
    private int persona;

    public Experiencia() {

    }

    public Experiencia(String puesto, String descripcion, String empresa,
            Date inicio,Date fin,String fotourl) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
    }
       

      public Experiencia(String puesto, String descripcion, String empresa,
            Date inicio,Date fin,String fotourl, int persona) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }
        
         @Override
    public String toString() {
        return "Experiencia{" +
                "idexperiencia=" + idexperiencia+
                ", puesto=" + puesto +
                ", descripcion=" + descripcion +
                ", empresa=" + empresa +
                ", inicio=" + inicio +
                ", fin=" + fin  +
                ", fotourl=" + fotourl  +
                '}';
    }
    
}
