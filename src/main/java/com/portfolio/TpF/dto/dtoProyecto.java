package com.portfolio.TpF.dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {

    @NotBlank
    private String img1;
    @NotBlank
    private String img2;
    @NotBlank
    private String img3;
    @NotBlank
    private String url;
    @NotBlank
    private int diego_id = 1;

    public dtoProyecto() {
    }

    public dtoProyecto(String img1, String img2, String img3, String url) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.url = url;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDiego_id() {
        return diego_id;
    }

    public void setDiego_id(int diego_id) {
        this.diego_id = diego_id;
    }

    
}
