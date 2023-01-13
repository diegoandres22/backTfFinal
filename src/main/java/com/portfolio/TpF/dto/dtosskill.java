
package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;


public class dtosskill {
    @NotBlank
    private String nombre_soft_skill;
    @NotBlank
    private String img_soft_skill;
    
    @NotBlank
    private int diego_id = 1;

    public dtosskill(String nombre_soft_skill, String img_soft_skill) {
        this.nombre_soft_skill = nombre_soft_skill;
        this.img_soft_skill = img_soft_skill;
    }

    public dtosskill() {
    }

    public String getNombre_soft_skill() {
        return nombre_soft_skill;
    }

    public void setNombre_soft_skill(String nombre_soft_skill) {
        this.nombre_soft_skill = nombre_soft_skill;
    }

    public String getImg_soft_skill() {
        return img_soft_skill;
    }

    public void setImg_soft_skill(String img_soft_skill) {
        this.img_soft_skill = img_soft_skill;
    }

    public int getDiego_id() {
        return diego_id;
    }

    public void setDiego_id(int diego_id) {
        this.diego_id = diego_id;
    }
    

}
