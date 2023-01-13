package com.portfolio.TpF.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String img1;
    private String img2;
    private String img3;
    private String url;
    
    private int diego_id = 1;

    public proyecto(long id, String img1, String img2, String img3, String url) {
        this.id = id;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.url = url;
    }

    public proyecto() {
    }

}
