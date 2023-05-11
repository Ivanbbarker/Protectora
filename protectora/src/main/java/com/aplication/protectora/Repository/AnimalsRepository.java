package com.aplication.protectora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplication.protectora.Model.Animals;

public interface AnimalsRepository extends JpaRepository<Animals,String>{
    
}
