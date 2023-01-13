package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencias {
   @NotBlank
    private String compania;
   @NotBlank
    private String tareas;
   @NotBlank
    private String fechainiyfina;
   @NotBlank
    private String imgtrabajo;
   @NotBlank
    private String puesto;
    @NotBlank
    private int diego_id = 1;

    public int getDiego_id() {
        return diego_id;
    }

    public void setDiego_id(int diego_id) {
        this.diego_id = diego_id;
    }
   

    public dtoExperiencias(String compania, String tareas, String fechainiyfina, String imgtrabajo, String puesto) {
        this.compania = compania;
        this.tareas = tareas;
        this.fechainiyfina = fechainiyfina;
        this.imgtrabajo = imgtrabajo;
        this.puesto = puesto;
    }

    public dtoExperiencias() {
        this.diego_id = 1;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getFechainiyfina() {
        return fechainiyfina;
    }

    public void setFechainiyfina(String fechainiyfina) {
        this.fechainiyfina = fechainiyfina;
    }

    public String getImgtrabajo() {
        return imgtrabajo;
    }

    public void setImgtrabajo(String imgtrabajo) {
        this.imgtrabajo = imgtrabajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
