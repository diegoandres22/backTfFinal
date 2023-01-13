package com.portfolio.TpF.service;

import com.portfolio.TpF.model.soskills;
import com.portfolio.TpF.repository.softSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class softSkillService implements iSoftSkillService {

    @Autowired
    public softSkillRepository sofRepo;

    @Override
    public List<soskills> verSSkill() {
        return sofRepo.findAll();
    }

    @Override
    public void crearSSkill(soskills sos) {
        sofRepo.save(sos);
    }

    @Override
    public void borrarSSkill(Long id) {
        sofRepo.deleteById(id);
    }

    @Override
    public soskills buscarSSkill(Long id) {
        return sofRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSSkill(soskills sos) {
        sofRepo.save(sos);
    }
     public Optional<soskills> getone(Long id){
        return sofRepo.findById(id);
    } 

}
