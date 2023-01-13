package com.portfolio.TpF.service;

import com.portfolio.TpF.model.proyecto;
import com.portfolio.TpF.repository.proyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proyectosService  implements iProyectosService{
    
    @Autowired
    public proyectoRepository proRepo;

    @Override
    public List<proyecto> verproyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearproyecto(proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarproyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public proyecto buscarproyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editarproyecto(proyecto pro) {
        proRepo.save(pro);
    }
     public Optional<proyecto> getone(Long id){
        return proRepo.findById(id);
    } 
}
