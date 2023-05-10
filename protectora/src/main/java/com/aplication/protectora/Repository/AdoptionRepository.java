package com.aplication.protectora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplication.protectora.Model.Adoption;

public interface AdoptionRepository extends JpaRepository<Adoption, Integer>{
    
}