package com.aplication.protectora.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.protectora.Model.Race;
import com.aplication.protectora.Repository.RaceRepository;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;

    // Find all races
    public List<Race> findAll() {
        return raceRepository.findAll();
    }

    // Find race by id
    public Race findById(int id) {
        Optional<Race> race = raceRepository.findById(id);
        if (race.isPresent()) {
            return race.get();
        } else {
            throw new RuntimeException("Race not found by ID:" + id);
        }
    }

    // Save new race
    public Race save(Race race) {
        return raceRepository.save(race);
    }

    // Update an existing race
    public Race update(int id, Race raceDetails){
        Race race = findById(id);
        race.setKingdom(raceDetails.getKingdom());
        race.setRaceName(raceDetails.getRaceName());
        return raceRepository.save(race);
    }

    public void delete(int id){
        Race race = findById(id);
        raceRepository.delete(race);
    }
}
