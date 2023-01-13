package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class experienciaslaborales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String compania;
    private String tareas;
    private String fechainiyfina;
    private String imgtrabajo;
    private String puesto;
    private int diego_id = 1;

  public experienciaslaborales(String compaNia, String tareas, String fechainiyfina, String imgtrabajo, String puesto) {
        this.compania = compaNia;
        this.tareas = tareas;
        this.fechainiyfina = fechainiyfina;
        this.imgtrabajo = imgtrabajo;
        this.puesto = puesto;
    }

    public experienciaslaborales() {
    }
  


}
