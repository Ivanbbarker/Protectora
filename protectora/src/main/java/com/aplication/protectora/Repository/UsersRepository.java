package com.aplication.protectora.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplication.protectora.Model.Users;

public interface UsersRepository extends JpaRepository<Users, UUID>{
    List<Users> findByuserName(String userName);
    Optional<Users> findById(UUID uuid);
}
