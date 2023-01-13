package com.portfolio.TpF.service;

import com.portfolio.TpF.model.Estudio;
import java.util.List;


public interface iEstudioService {
   
    public List<Estudio> verEstudio();

    public void crearEstudio(Estudio per);

    public void borrarEstudio(Long id);

    public Estudio buscarEstudio(Long id);

    public void editarEstudio(Estudio per);

}
