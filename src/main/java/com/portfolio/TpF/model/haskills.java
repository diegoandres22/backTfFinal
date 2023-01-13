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

public class haskills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre_hard_skill;
    private String img_hard_skill;
    private String liquido;
    private int diego_id = 1;

    public haskills(long id, String nombre_hard_skill, String img_hard_skill, String liquido) {
        this.id = id;
        this.nombre_hard_skill = nombre_hard_skill;
        this.img_hard_skill = img_hard_skill;
        this.liquido = liquido;
    }

    public haskills() {
    }

}
