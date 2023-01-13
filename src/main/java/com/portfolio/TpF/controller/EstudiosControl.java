package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtoEstudios;
import com.portfolio.TpF.model.Estudio;
import com.portfolio.TpF.service.estudioService;
import com.portfolio.TpF.service.iEstudioService;
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
@RequestMapping("estudy")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudiosControl {

    @Autowired
    private iEstudioService estuser;
    @Autowired
    private estudioService estuservic;

    @GetMapping("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios() {
        return estuser.verEstudio();
    }

    @GetMapping("/ver/testudios")
    public ResponseEntity<List<Estudio>> lista() {
        List<Estudio> lalista = estuser.verEstudio();
        return new ResponseEntity(lalista, HttpStatus.OK);
    }

    @PostMapping("/new/estudio")
    public ResponseEntity agregarEstudio(@RequestBody Estudio estu) {
        estuser.crearEstudio(estu);
        return new ResponseEntity(new Mensaje("se creó el estudio "), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity borrarEstudio(@PathVariable Long id) {
        estuser.borrarEstudio(id);
        return new ResponseEntity(new Mensaje("se borró el estudio "), HttpStatus.OK);
    }

    @GetMapping("/buscarEstudy/{id}")
    public Estudio buscarExperiencia(@PathVariable Long id) {
        return estuser.buscarEstudio(id);
    }

    @PutMapping("/editarEstudi/{id}")
    public ResponseEntity editarPersona(@PathVariable Long id,
            @RequestBody dtoEstudios dtoestu) {

        Estudio estudi = estuservic.getone(id).get();

        estudi.setColegio(dtoestu.getColegio());
        estudi.setTitulo_obtenido(dtoestu.getTitulo_obtenido());
        estudi.setFechainiyfin(dtoestu.getFechainiyfin());
        estudi.setImg_instituto(dtoestu.getImg_instituto());

        estuservic.editarEstudio(estudi);
        return new ResponseEntity(new Mensaje("se modificó el estudio "), HttpStatus.OK);
    }

}
