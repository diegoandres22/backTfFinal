package com.portfolio.TpF.service;

import com.portfolio.TpF.model.experienciaslaborales;
import java.util.List;

public interface iExperienciaslaboralesService {

    public List<experienciaslaborales> verExperiencias();

    public void crearExperiencia(experienciaslaborales expe);

    public void borrarExperiencia(Long id);

    public experienciaslaborales buscarExperiencia(Long id);

    public void editarExperiencia(experienciaslaborales expe);

}
