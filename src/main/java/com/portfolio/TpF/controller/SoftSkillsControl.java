package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtosskill;
import com.portfolio.TpF.model.soskills;
import com.portfolio.TpF.service.iSoftSkillService;
import com.portfolio.TpF.service.softSkillService;
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
@RequestMapping("soft")
@CrossOrigin(origins = "http://localhost:4200")
public class SoftSkillsControl {

    @Autowired
    private iSoftSkillService estusoft;
    @Autowired
    private softSkillService estusofts;

    @GetMapping("/ver/soft")
    @ResponseBody
    public List<soskills> versofts() {
        return estusoft.verSSkill();
    }

    @GetMapping("/ver/tsoft")
    public ResponseEntity<List<soskills>> lista() {
        List<soskills> lalista = estusoft.verSSkill();
        return new ResponseEntity(lalista, HttpStatus.OK);
    }

    @PostMapping("/new/soft")
    public ResponseEntity agregarsoft(@RequestBody soskills nsoft) {
        estusoft.crearSSkill(nsoft);
        return new ResponseEntity(new Mensaje("se creó la Soft Skill "), HttpStatus.OK);
    }

    @DeleteMapping("/deletesoft/{id}")
    public ResponseEntity borrarsoft(@PathVariable Long id) {
        estusoft.borrarSSkill(id);
        return new ResponseEntity(new Mensaje("se borró la Soft Skill "), HttpStatus.OK);
    }

    @GetMapping("/buscarsoft/{id}")
    public soskills buscarsoft(@PathVariable Long id) {
        return estusoft.buscarSSkill(id);
    }

    @PutMapping("/editarsoft/{id}")
    public ResponseEntity editarsoft(@PathVariable Long id,
            @RequestBody dtosskill dtoskil) {

        soskills sskill = estusofts.getone(id).get();

        sskill.setImg_soft_skill(dtoskil.getImg_soft_skill());
        sskill.setNombre_soft_skill(dtoskil.getNombre_soft_skill());

        estusofts.editarSSkill(sskill);
        return new ResponseEntity(new Mensaje("se modificó la Soft Skill "), HttpStatus.OK);
    }

}
