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

import com.aplication.protectora.Model.Race;
import com.aplication.protectora.Services.RaceService;

@Controller
@RequestMapping("/races")
public class RaceController {
    
    @Autowired
    private RaceService raceService;
    
    @GetMapping
    public ResponseEntity<List<Race>> getAllRaces(){
        List<Race> races = raceService.findAll();
        return new ResponseEntity<>(races, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Race> getRaceById(@PathVariable int id){
        Race race = raceService.findById(id);
        return new ResponseEntity<>(race, HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public String verRaceDetalle(@PathVariable int id, Model model){
        Race race = raceService.findById(id);
        model.addAttribute("race", race);
        return "/views/Races/race-details";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Race> createRace(@ModelAttribute Race race){
        Race newRace = raceService.save(race);
        return new ResponseEntity<>(newRace, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Race> updateRace(@PathVariable int id, @RequestBody Race race){
        Race updatedRace = raceService.save(race);
        return new ResponseEntity<>(updatedRace, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRace(@PathVariable int id){
        raceService.delete(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    public RaceController(RaceService raceService){
        this.raceService = raceService;
    }

    @GetMapping("/listado-race")
    public String listarRace(Model model){
        List<Race> races = raceService.findAll();
        model.addAttribute("races", races);
        model.addAttribute("race", new Race());
        return "/views/Races/listado-race";
    }


}
