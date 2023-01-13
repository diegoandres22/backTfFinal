package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtoDiego;
import com.portfolio.TpF.model.Diego;
import com.portfolio.TpF.service.diegoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.TpF.service.iDiegoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class controller {

    @Autowired
    private iDiegoService persoser;
    @Autowired
    private diegoService persoservi;

    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody Diego perso) {
        persoser.crearPersona(perso);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Diego> verPersonas() {
        return persoser.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoser.borrarPersona(id);
    }

    @GetMapping("/buscar/{id}")
    public Diego buscarPersona(@PathVariable Long id) {
        return persoser.buscarPersona(id);
    }
    @PutMapping("/editar/{id}")
    public ResponseEntity editarPersona(@PathVariable Long id,
            @RequestBody dtoDiego dtodie) {

        Diego eldie = persoservi.getone(id).get();

        eldie.setNombre(dtodie.getNombre());
        eldie.setTitulo(dtodie.getTitulo());
        eldie.setParrafo_f(dtodie.getParrafo_f());
        eldie.setParrafo_s(dtodie.getParrafo_s());
        eldie.setImgperfil(dtodie.getImgperfil());
        eldie.setImgbanner(dtodie.getImgbanner());
        eldie.setCurriculum(dtodie.getCurriculum());
        
        persoservi.editarPersona(eldie);
        
        return new ResponseEntity(new Mensaje("se modificó a Diego "), HttpStatus.OK);
    }


   
}
