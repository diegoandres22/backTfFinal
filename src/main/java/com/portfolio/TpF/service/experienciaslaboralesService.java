package com.portfolio.TpF.service;

import com.portfolio.TpF.model.experienciaslaborales;
import com.portfolio.TpF.repository.experienciaslaboralesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienciaslaboralesService implements iExperienciaslaboralesService {

    @Autowired
    public experienciaslaboralesRepository expeRepo;
    

    @Override
    public List<experienciaslaborales> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(experienciaslaborales expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public experienciaslaborales buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(experienciaslaborales expe) {
        expeRepo.save(expe);
    }
    public Optional<experienciaslaborales> getone(Long id){
        return expeRepo.findById(id);
    } 

}
