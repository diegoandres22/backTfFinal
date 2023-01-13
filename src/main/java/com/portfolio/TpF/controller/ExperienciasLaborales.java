package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtoExperiencias;
import com.portfolio.TpF.model.experienciaslaborales;
import com.portfolio.TpF.service.experienciaslaboralesService;
import com.portfolio.TpF.service.iExperienciaslaboralesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exlab")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciasLaborales {

    @Autowired
    private iExperienciaslaboralesService expeser;
     @Autowired
    private experienciaslaboralesService expeservic;

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<experienciaslaborales> verexperiencia() {
        return expeser.verExperiencias();
    }

    @GetMapping("/ver/texperiencias")
    public ResponseEntity<List<experienciaslaborales>> lista() {
        List<experienciaslaborales> lalista = expeser.verExperiencias();
        return new ResponseEntity(lalista, HttpStatus.OK);
    }

    @PostMapping("/new/experiencia")
    public ResponseEntity agregarexperiencia(@RequestBody experienciaslaborales expe) {
        expeser.crearExperiencia(expe);
        return new ResponseEntity(new Mensaje("se creó la experiencia "), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity borrarExperiencia(@PathVariable Long id) {
        expeser.borrarExperiencia(id);
        return new ResponseEntity(new Mensaje("se borró la experiencia "), HttpStatus.OK);
    }

    @GetMapping("/buscarexperi/{id}")
    public experienciaslaborales buscarExperiencia(@PathVariable Long id) {
        return expeser.buscarExperiencia(id);
    }

    @PutMapping("/editarexperi/{id}")
    public ResponseEntity editarPersona(@PathVariable Long id,
            @RequestBody dtoExperiencias dtoexpe) {

      experienciaslaborales experi = expeservic.getone(id).get();
      
      experi.setCompania(dtoexpe.getPuesto());
      experi.setTareas(dtoexpe.getTareas());
      experi.setFechainiyfina(dtoexpe.getFechainiyfina());
      experi.setImgtrabajo(dtoexpe.getImgtrabajo());
      experi.setPuesto(dtoexpe.getPuesto());
      
      expeservic.editarExperiencia(experi);
        return new ResponseEntity(new Mensaje("se modificó la experiencia "), HttpStatus.OK);
    }

}
