package com.aplication.protectora.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.protectora.Model.Animals;
import com.aplication.protectora.Repository.AnimalsRepository;

@Service
public class AnimalsService {

    @Autowired
    private AnimalsRepository animalsRepository;

    public List<Animals> findAll() {
        return animalsRepository.findAll();
    }

    public Animals findById(String id) {
        Optional<Animals> animals = animalsRepository.findById(id);
        if (animals.isPresent()) {
            return animals.get();
        } else {
            throw new RuntimeException("Animal not found by id: " + id);
        }
    }

    public Animals save(Animals animal) {
        return animalsRepository.save(animal);
    }

    public Animals update(String id, Animals animalDetails) {
        Animals animal = findById(id);

        animal.setAnimalDepartureDate(animalDetails.getAnimalDepartureDate());
        animal.setAnimalDateOfEntry(animal.getAnimalDateOfEntry());
        animal.setAnimalHeight(animalDetails.getAnimalHeight());
        animal.setAnimalWeight(animalDetails.getAnimalWeight());
        animal.setAnimalName(animalDetails.getAnimalName());
        animal.setAnimalPathology(animalDetails.getAnimalPathology());

        return animalsRepository.save(animal);

    }

    public void delete(String id) {
        Animals animal = findById(id);
        animalsRepository.delete(animal);
    }

}
