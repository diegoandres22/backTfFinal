package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String colegio;
    private String titulo_obtenido;
    private String fechainiyfin;
    private String img_instituto;
    private int diego_id = 1;

    public Estudio() {
    }

    public Estudio(long id, String colegio, String titulo_obtenido, String fechainiyfin, String img_instituto) {
        this.id = id;
        this.colegio = colegio;
        this.titulo_obtenido = titulo_obtenido;
        this.fechainiyfin = fechainiyfin;
        this.img_instituto = img_instituto;
    }
    
}
