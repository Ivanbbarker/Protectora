package com.aplication.protectora.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.protectora.Model.Adoption;
import com.aplication.protectora.Repository.AdoptionRepository;

@Service
public class AdoptionService {
    
    @Autowired
    private AdoptionRepository adoptionRepository;

    public List<Adoption> findAll(){
        return adoptionRepository.findAll();
    }

    public Adoption findById(int id){
        Optional<Adoption> adoption = adoptionRepository.findById(id);
        if (adoption.isPresent()) {
            return adoption.get();
        } else {
            throw new RuntimeException("Adoption not found by ID:" + id);
        }
    }

    public Adoption save(Adoption adoption){
        return adoptionRepository.save(adoption);
    }

    public Adoption update(int id, Adoption adoptionDetails){
        Adoption adoption = findById(id);
        adoption.setAdoptionCity(adoptionDetails.getAdoptionCity());
        adoption.setAdoptionConsent(adoptionDetails.getAdoptionConsent());
        adoption.setAdoptionCountry(adoptionDetails.getAdoptionCountry());
        adoption.setAdoptionPostalCode(adoptionDetails.getAdoptionPostalCode());
        adoption.setAdoptionTax(adoptionDetails.getAdoptionTax());
        adoption.setDateAdoption(adoptionDetails.getDateAdoption());
        return adoptionRepository.save(adoption);
    }

    public void delete(int id){
        Adoption adoption = findById(id);
        adoptionRepository.delete(adoption);
    }
}
