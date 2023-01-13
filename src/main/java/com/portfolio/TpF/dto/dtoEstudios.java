package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;

public class dtoEstudios {

    @NotBlank
    private String colegio;
    @NotBlank
    private String titulo_obtenido;
    @NotBlank
    private String fechainiyfin;
    @NotBlank
    private String img_instituto;
    @NotBlank
    private int diego_id = 1;

    public int getDiego_id() {
        return diego_id;
    }

    public void setDiego_id(int diego_id) {
        this.diego_id = diego_id;
    }

    
    
    public dtoEstudios(String colegio, String titulo_obtenido, String fechainiyfin, String img_instituto) {
        this.colegio = colegio;
        this.titulo_obtenido = titulo_obtenido;
        this.fechainiyfin = fechainiyfin;
        this.img_instituto = img_instituto;
    }

    public dtoEstudios() {
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getTitulo_obtenido() {
        return titulo_obtenido;
    }

    public void setTitulo_obtenido(String titulo_obtenido) {
        this.titulo_obtenido = titulo_obtenido;
    }

    public String getFechainiyfin() {
        return fechainiyfin;
    }

    public void setFechainiyfin(String fechainiyfin) {
        this.fechainiyfin = fechainiyfin;
    }

    public String getImg_instituto() {
        return img_instituto;
    }

    public void setImg_instituto(String img_instituto) {
        this.img_instituto = img_instituto;
    }
    

    
    
}
