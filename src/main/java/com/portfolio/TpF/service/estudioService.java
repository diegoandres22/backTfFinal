package com.portfolio.TpF.service;

import com.portfolio.TpF.model.Estudio;
import com.portfolio.TpF.repository.estudioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estudioService implements iEstudioService {

    @Autowired
    public estudioRepository estuRepo;

    @Override
    public List<Estudio> verEstudio() {
        return estuRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio per) {
        estuRepo.save(per);
    }

    @Override
    public void borrarEstudio(Long id) {
        estuRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estuRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEstudio(Estudio per) {
        estuRepo.save(per);
    }
     public Optional<Estudio> getone(Long id){
        return estuRepo.findById(id);
    } 

}
