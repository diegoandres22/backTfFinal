package com.portfolio.TpF.service;

import com.portfolio.TpF.model.soskills;
import java.util.List;

public interface iSoftSkillService {

    public List<soskills> verSSkill();

    public void crearSSkill(soskills sos);

    public void borrarSSkill(Long id);

    public soskills buscarSSkill(Long id);

    public void editarSSkill(soskills sos);

}
