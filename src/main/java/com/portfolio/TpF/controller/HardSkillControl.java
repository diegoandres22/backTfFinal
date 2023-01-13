
package com.portfolio.TpF.controller;

import com.portfolio.TpF.Security.Controller.Mensaje;
import com.portfolio.TpF.dto.dtohskill;
import com.portfolio.TpF.model.haskills;
import com.portfolio.TpF.service.haskillsService;
import com.portfolio.TpF.service.iHaskillsService;
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
@RequestMapping("hard")
@CrossOrigin(origins = "http://localhost:4200")
public class HardSkillControl {
    @Autowired
    private iHaskillsService estuhard;
    @Autowired
    private haskillsService estuhards;

    @GetMapping("/ver/hard")
    @ResponseBody
    public List<haskills> verhards() {
        return estuhard.verHSkill();
    }

    @GetMapping("/ver/thard")
    public ResponseEntity<List<haskills>> lista() {
        List<haskills> lalista = estuhard.verHSkill();
        return new ResponseEntity(lalista, HttpStatus.OK);
    }

    @PostMapping("/new/hard")
    public ResponseEntity agregarhard(@RequestBody haskills nsoft) {
        estuhard.crearHSkill(nsoft);
        return new ResponseEntity(new Mensaje("se creó la Soft Skill "), HttpStatus.OK);
    }

    @DeleteMapping("/deletehard/{id}")
    public ResponseEntity borrarhard(@PathVariable Long id) {
        estuhard.borrarHSkill(id);
        return new ResponseEntity(new Mensaje("se borró la Soft Skill "), HttpStatus.OK);
    }

    @GetMapping("/buscarhard/{id}")
    public haskills buscarhard(@PathVariable Long id) {
        return estuhard.buscarHSkill(id);
    }

    @PutMapping("/editarhard/{id}")
    public ResponseEntity editarhard(@PathVariable Long id,
            @RequestBody dtohskill dtohskil) {

        haskills hskill = estuhards.getone(id).get();

        hskill.setNombre_hard_skill(dtohskil.getNombre_hard_skill());
        hskill.setImg_hard_skill(dtohskil.getImg_hard_skill());
         hskill.setLiquido(dtohskil.getLiquido());
       
        estuhards.editarHSkill(hskill);
        return new ResponseEntity(new Mensaje("se modificó la Hard Skill "), HttpStatus.OK);
    }

}
