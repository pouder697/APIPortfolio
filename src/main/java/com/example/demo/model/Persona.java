package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name ="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersona;
    private String nombre;
    private String apellido;
    private String email;
    private String titulo;
    private String telefono;
    private String ubicacion;
    private String acerca;
    private String fotourl;
    private String bannerurl;
    private String username;
    private String password;
    
    @Transient
    private String token;

    public Persona(int idpersona, String nombre, String apellido, String email, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String bannerurl, String username, String password) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.fotourl = fotourl;
        this.bannerurl = bannerurl;
        this.username = username;
        this.password = password;
    }

    public Persona(String nombre, String apellido, String email, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String bannerurl, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.fotourl = fotourl;
        this.bannerurl = bannerurl;
        this.username = username;
        this.password = password;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona + 
                ", nombre=" + nombre +
                ", apellido=" + apellido + 
                ", email=" + email + 
                ", titulo=" + titulo + 
                ", telefono=" + telefono + 
                ", ubicacion=" + ubicacion + 
                ", acerca=" + acerca + 
                ", fotourl=" + fotourl + 
                ", bannerurl=" + bannerurl + 
                ", username=" + username + 
                ", password=" + password + '}';
    }

}
