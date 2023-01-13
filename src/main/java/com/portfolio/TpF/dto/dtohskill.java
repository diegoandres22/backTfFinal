package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;

public class dtohskill {

    @NotBlank
    private String nombre_hard_skill;
    @NotBlank
    private String img_hard_skill;
    @NotBlank
    private String liquido;
    @NotBlank
    private int diego_id = 1;

    public dtohskill() {
    }

    public dtohskill(String nombre_hard_skill, String img_hard_skill, String liquido) {
        this.nombre_hard_skill = nombre_hard_skill;
        this.img_hard_skill = img_hard_skill;
        this.liquido = liquido;
    }

    public String getNombre_hard_skill() {
        return nombre_hard_skill;
    }

    public void setNombre_hard_skill(String nombre_hard_skill) {
        this.nombre_hard_skill = nombre_hard_skill;
    }

    public String getImg_hard_skill() {
        return img_hard_skill;
    }

    public void setImg_hard_skill(String img_hard_skill) {
        this.img_hard_skill = img_hard_skill;
    }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

    public int getDiego_id() {
        return diego_id;
    }

    public void setDiego_id(int diego_id) {
        this.diego_id = diego_id;
    }

}
