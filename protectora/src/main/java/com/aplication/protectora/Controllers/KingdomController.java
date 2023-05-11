package com.aplication.protectora.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aplication.protectora.Model.Kingdom;
import com.aplication.protectora.Services.KingdomService;


@Controller
@RequestMapping("/kingdom")
public class KingdomController {
    
    @Autowired
    private KingdomService kingdomService;
    
    @GetMapping
    public ResponseEntity<List<Kingdom>> getAllRaces(){
        List<Kingdom> kingdom = kingdomService.findAll();
        return new ResponseEntity<>(kingdom, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kingdom> getRaceById(@PathVariable int id){
        Kingdom kingdom = kingdomService.findById(id);
        return new ResponseEntity<>(kingdom, HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public String verRaceDetalle(@PathVariable int id, Model model){
        Kingdom kingdom = kingdomService.findById(id);
        model.addAttribute("kingdom", kingdom);
        return "/views/Kingdom/kingdom-details";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Kingdom> createRace(@ModelAttribute Kingdom kingdom){
        Kingdom newKingdom = kingdomService.save(kingdom);
        return new ResponseEntity<>(newKingdom, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kingdom> updateRace(@PathVariable int id, @RequestBody Kingdom kingdom){
        Kingdom updatedKingdom = kingdomService.save(kingdom);
        return new ResponseEntity<>(updatedKingdom, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRace(@PathVariable int id){
        kingdomService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public KingdomController(KingdomService kingdomService){
        this.kingdomService = kingdomService;
    }

    @GetMapping("/list-kingdom")
    public String listarRace(Model model){
        List<Kingdom> races = kingdomService.findAll();
        model.addAttribute("kingdoms", races);
        model.addAttribute("kingdom", new Kingdom());
        return "/views/Kingdom/list-kingdom";
    }


}
