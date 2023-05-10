package com.aplication.protectora.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.protectora.Model.Kingdom;
import com.aplication.protectora.Repository.KingdomRepository;

@Service
public class KingdomService {
    
    @Autowired
    private KingdomRepository kingdomRepository;

    //Find all kingdoms
    public List<Kingdom> findAll(){
        return kingdomRepository.findAll();
    }

    //Find kingdom by ID
    public Kingdom findById(int id){
        Optional<Kingdom> kingdom = kingdomRepository.findById(id);
        if (kingdom.isPresent()) {
            return kingdom.get();
        } else {
            throw new RuntimeException("Kingdom not found for ID:" + id);
        }
    }

    //Save a Kingdom
    public Kingdom save(Kingdom kingdom){
        
    }
}
