
package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtoProyecto;
import com.portfolio.TpF.model.proyecto;
import com.portfolio.TpF.service.iProyectosService;
import com.portfolio.TpF.service.proyectosService;
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
@RequestMapping("pro")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosControl {
     @Autowired
    private iProyectosService proye;
    @Autowired
    private proyectosService proyecs;
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<proyecto> verpro() {
        return proye.verproyectos();
    }

    @GetMapping("/ver/troyectos")
    public ResponseEntity<List<proyecto>> lista() {
        List<proyecto> lalista = proye.verproyectos();
        return new ResponseEntity(lalista, HttpStatus.OK);
    }

    @PostMapping("/new/proyecto")
    public ResponseEntity agregarpro(@RequestBody proyecto pro) {
        proye.crearproyecto(pro);
        return new ResponseEntity(new Mensaje("se creó el proyecto "), HttpStatus.OK);
    }

    @DeleteMapping("/deletepro/{id}")
    public ResponseEntity borrarpro(@PathVariable Long id) {
        proye.borrarproyecto(id);
        return new ResponseEntity(new Mensaje("se borró el proyecto "), HttpStatus.OK);
    }

    @GetMapping("/buscarpro/{id}")
    public proyecto buscarpro(@PathVariable Long id) {
        return proye.buscarproyecto(id);
    }

    @PutMapping("/editarpro/{id}")
    public ResponseEntity editarpro(@PathVariable Long id,
            @RequestBody dtoProyecto dtopro) {

        proyecto obo = proyecs.getone(id).get();

        obo.setImg1(dtopro.getImg1());
        obo.setImg2(dtopro.getImg2());
         obo.setImg3(dtopro.getImg3());
         obo.setUrl(dtopro.getUrl());
       
        proyecs.editarproyecto(obo);
        return new ResponseEntity(new Mensaje("se modificó el proyecto "), HttpStatus.OK);
    }
    
    
}
