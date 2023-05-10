package com.aplication.protectora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplication.protectora.Model.Kingdom;

public interface KingdomRepository extends JpaRepository<Kingdom, Integer> {
    
}
