package com.aplication.protectora.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aplication.protectora.Model.Animals;
import com.aplication.protectora.Services.AnimalsService;

import java.util.List;

@Controller
@RequestMapping("/animals")
public class AnimalsController {
    
    @Autowired
    private AnimalsService animalsService;

    @GetMapping
    public ResponseEntity<List<Animals>> getAllAnimals(){
        List<Animals> animals = animalsService.findAll();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animals> getAnimalsById(@PathVariable String id){
        Animals animal = animalsService.findById(id);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }

    @GetMapping("/details/{id}")
    public String animalsDetalle(@PathVariable String id, Model model){
        Animals animal = animalsService.findById(id);
        model.addAttribute("animals", animal);
        return "/view/Animals/animals-details";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Animals> createAnimals(@ModelAttribute Animals animal){
        Animals newAnimal = animalsService.save(animal);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animals> updateAnimals(@PathVariable String id, @RequestBody Animals animal){
        Animals updateAnimal = animalsService.update(id, animal);
        return new ResponseEntity<>(updateAnimal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Animals> deleteAnimals(@PathVariable String id){
        animalsService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public AnimalsController(AnimalsService animalsService){
        this.animalsService = animalsService;
    }

    @GetMapping("/animals/animal-list")
    public String listarAnimals(Model model){
        List<Animals> animals = animalsService.findAll();
        model.addAttribute("animals", animals);
        model.addAttribute("animal", new Animals());
        return "/views/Animals/animal-list";
    }

}
