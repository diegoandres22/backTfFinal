/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author diego
 */
public class dtoDiego {
    @NotBlank
    private String nombre;
    @NotBlank
    private String titulo;
    @NotBlank
    private String parrafo_f;
    @NotBlank
    private String parrafo_s;
    @NotBlank
    private String imgperfil;
    @NotBlank
    private String imgbanner;
    @NotBlank
    private String curriculum;

    public dtoDiego() {
    }

    public dtoDiego(String nombre, String titulo, String parrafo_f, String parrafo_s, String imgperfil, String imgbanner, String curriculum) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.parrafo_f = parrafo_f;
        this.parrafo_s = parrafo_s;
        this.imgperfil = imgperfil;
        this.imgbanner = imgbanner;
        this.curriculum = curriculum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getParrafo_f() {
        return parrafo_f;
    }

    public void setParrafo_f(String parrafo_f) {
        this.parrafo_f = parrafo_f;
    }

    public String getParrafo_s() {
        return parrafo_s;
    }

    public void setParrafo_s(String parrafo_s) {
        this.parrafo_s = parrafo_s;
    }

    public String getImgperfil() {
        return imgperfil;
    }

    public void setImgperfil(String imgperfil) {
        this.imgperfil = imgperfil;
    }

    public String getImgbanner() {
        return imgbanner;
    }

    public void setImgbanner(String imgbanner) {
        this.imgbanner = imgbanner;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
    
    
}
