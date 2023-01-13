package com.portfolio.TpF.service;

import com.portfolio.TpF.model.Diego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.TpF.repository.diegoRepository;
import java.util.Optional;

@Service
public class diegoService implements iDiegoService {

    @Autowired
    public diegoRepository persoRepo;

    @Override
    public List<Diego> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Diego per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Diego buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Diego per) {
        persoRepo.save(per);
    }
      public Optional<Diego> getone(Long id){
        return persoRepo.findById(id);
    } 
}

