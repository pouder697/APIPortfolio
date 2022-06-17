
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
@Table(name = "educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ideducacion;

    private String titulo;
    private Date fechafin;
    private String institucion;
    private String institucionurl;
    private String fotourl;
    private int persona;

    public Educacion() {

    }

    public Educacion(String titulo, Date fechafin, String institucion,
            String institucionurl, String fotourl) {
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;

    }

    public Educacion(String titulo, Date fechafin, String institucion,
            String institucionurl, String fotourl, int persona) {
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;
        this.persona = persona;

    }

    @Override
    public String toString() {
        return "Educacion{"
                + "ideducacion=" + ideducacion
                + ", titulo=" + titulo
                + ", fechafin=" + fechafin
                + ", institucion=" + institucion
                + ", institucionurl=" + institucionurl                                       
                + ", fotourl=" + fotourl
                + '}';
    }

}
