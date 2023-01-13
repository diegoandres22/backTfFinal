package com.portfolio.TpF.service;

import com.portfolio.TpF.model.Diego;
import java.util.List;

public interface iDiegoService {

    public List<Diego> verPersonas();

    public void crearPersona(Diego per);

    public void borrarPersona(Long id);

    public Diego buscarPersona(Long id);

    public void editarPersona(Diego per);

}
