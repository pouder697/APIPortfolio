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

/**
 *
 * @author Andres
 */
@Getter
@Setter
@Entity
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproyecto;

    private String titulo;
    private String descripcion;
    private String url;
    private int persona;

    public Proyecto() {

    }

    public Proyecto(String titulo, String descripcion, String url) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public Proyecto(int idproyecto, String titulo, String descripcion, String url,
            int persona) {
        this.idproyecto = idproyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Proyecto{"
                + "idproyecto=" + idproyecto
                + ", titulo=" + titulo
                + ", descripcion=" + descripcion
                + ", url=" + url
                + ", persona=" + persona + '}';
    }

}
