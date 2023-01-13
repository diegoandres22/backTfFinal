package com.portfolio.TpF.service;

import com.portfolio.TpF.model.haskills;
import java.util.List;


public interface iHaskillsService {
    
    public List<haskills> verHSkill();

    public void crearHSkill(haskills haskill);

    public void borrarHSkill(Long id);

    public haskills buscarHSkill(Long id);

    public void editarHSkill(haskills haskill);

}
