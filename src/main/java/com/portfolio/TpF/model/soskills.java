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

public class soskills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre_soft_skill;
    private String img_soft_skill;
            
    private int diego_id = 1;

    public soskills() {
    }

    public soskills(long id, String skill, String imgSkill) {
        this.id = id;
        this.nombre_soft_skill = skill;
        this.img_soft_skill = imgSkill;
    }
 
}
