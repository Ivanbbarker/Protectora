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

import com.aplication.protectora.Model.Adoption;
import com.aplication.protectora.Services.AdoptionService;

@Controller
@RequestMapping("/adoption")
public class AdoptionController {
    
    @Autowired
    private AdoptionService adoptionService;

    @GetMapping
    public ResponseEntity<List<Adoption>> getallAdoptions(){
        List<Adoption> adoptions = adoptionService.findAll();
        return new ResponseEntity<>(adoptions, HttpStatus.OK);
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Adoption> getAdoptionById(int id){
        Adoption adoption = adoptionService.findById(id);
        return new ResponseEntity<>(adoption, HttpStatus.OK);
    }

    @GetMapping("/details/{id}")
    public String showAdoptionDetails(@PathVariable int id, Model model){
        Adoption adoption = adoptionService.findById(id);
        model.addAttribute("adoption", adoption);
        return "/views/Adoption/adoption-details";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Adoption> createAdoption(@ModelAttribute Adoption adoption){
        Adoption newAdoption = adoptionService.save(adoption);
        return new ResponseEntity<>(newAdoption, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Adoption> updateAdoption(@PathVariable int id, @RequestBody Adoption adoption){
        Adoption updatedAdoption = adoptionService.update(id, adoption);
        return new ResponseEntity<>(updatedAdoption, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdoption(@PathVariable int id){
        adoptionService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public AdoptionController(AdoptionService adoptionService){
        this.adoptionService = adoptionService;
    }
    
    @GetMapping("/list-adoptions")
    public String listAdoptions(Model model){
        List<Adoption> adoptions = adoptionService.findAll();
        model.addAttribute("adoptions", adoptions);
        model.addAttribute("adoption", new Adoption());
        return "/view/Adoptions/list-adoptions";
    }

}
