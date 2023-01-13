package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Diego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String nombre;
    private String titulo;
    private String parrafo_f;
    private String parrafo_s;
    private String imgperfil;
    private String imgbanner;
    private String curriculum;

    public Diego( String nombreCompleto, String titulo, String parrafo1, String parrafo2, String imgPerfil, String imgBanner, String curriculum) {
        
        this.nombre = nombreCompleto;
        this.titulo = titulo;
        this.parrafo_f = parrafo1;
        this.parrafo_s = parrafo2;
        this.imgperfil = imgPerfil;
        this.imgbanner = imgBanner;
        this.curriculum = curriculum;
    }

    public Diego() {
    }

}
