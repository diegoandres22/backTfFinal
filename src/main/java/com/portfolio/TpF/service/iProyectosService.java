package com.portfolio.TpF.service;

import com.portfolio.TpF.model.proyecto;
import java.util.List;


public interface iProyectosService {
    
        public List<proyecto> verproyectos();

    public void crearproyecto(proyecto pro);

    public void borrarproyecto(Long id);

    public proyecto buscarproyecto(Long id);

    public void editarproyecto(proyecto pro);

}
