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
        return kingdomRepository.save(kingdom);
    }

    //Update existing kingdom
    public Kingdom update(int id, Kingdom kingdomDetails){
        Kingdom kingdom = findById(id);

        kingdom.setFamilyName(kingdomDetails.getFamilyName());
        kingdom.setIcon(kingdomDetails.getIcon());
        kingdom.setRaces(kingdomDetails.getRaces());

        return kingdomRepository.save(kingdom);
    }

    //Delete existing kingdom
    public void delete(int id){
        Kingdom kingdom = findById(id);
        kingdomRepository.delete(kingdom);
    }
}
