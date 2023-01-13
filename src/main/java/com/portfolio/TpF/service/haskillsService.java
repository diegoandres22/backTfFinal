package com.portfolio.TpF.service;

import com.portfolio.TpF.model.haskills;
import com.portfolio.TpF.repository.haskillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class haskillsService implements iHaskillsService {

  
    @Autowired
    public haskillsRepository haRepo;

    @Override
    public List<haskills> verHSkill() {
        return haRepo.findAll();
    }

    @Override
    public void crearHSkill(haskills hskill) {
        haRepo.save(hskill);
    }

    @Override
    public void borrarHSkill(Long id) {
        haRepo.deleteById(id);
    }

    @Override
    public haskills buscarHSkill(Long id) {
        return haRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHSkill(haskills skill) {
        haRepo.save(skill);
    }

     public Optional<haskills> getone(Long id){
        return haRepo.findById(id);
    } 
}
