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
@Table(name="redes")
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idredes;

    private String nombre;
    private String url;
    private String fotourl;
    private int persona;

    public Redes() {

    }

    public Redes(String nombre, String url, String fotourl) {
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
    }

    public Redes(String nombre, String url, String fotourl, int persona) {
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
        this.persona = persona;
    }
    
    @Override
    public String toString() {
        return "Redes{" +
            " idredes='" + getIdredes() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", url='" + getUrl() + "'" +
            ", fotourl='" + getFotourl() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }
    
}