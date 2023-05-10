package com.aplication.protectora.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.protectora.Model.Users;
import com.aplication.protectora.Repository.UsersRepository;

@Service
public class UserService {
    
    @Autowired
    private UsersRepository usersRepository;

    //Encontramos a todos los usuarios
    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    //Encontrar un usuario por ID
    public Users findById(UUID id){
        Optional<Users> user = usersRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("Usuario no encontrado con id: "+ id);
        }
    }

    //Encontrar un usuario por name
    public List<Users> findByName(String name){
        return usersRepository.findByuserName(name);
    }

    //Guardar un usuario
    public Users save(Users users){
        return usersRepository.save(users);
    }

    //Actualizar un usuario existente
    public Users update(UUID id, Users userDetails) {
        Users user = findById(id);
        user.setUserName(userDetails.getUserName());
        user.setUserSurname(userDetails.getUserSurname());
        user.setUserDni(userDetails.getUserDni());
        user.setUserBirthDate(userDetails.getUserBirthDate());
        user.setEmailUser(userDetails.getEmailUser());
        user.setUserPassword(userDetails.getUserPassword());
        user.setUserPhone(userDetails.getUserPhone());
        user.setUserAddress(userDetails.getUserAddress());
        user.setUserCity(userDetails.getUserCity());
        user.setUserCountry(userDetails.getUserCountry());
        user.setUserPostalCode(userDetails.getUserPostalCode());
        user.setUserRole(userDetails.getUserRole());
        user.setUserWeigth(userDetails.getUserWeigth());
        user.setUserHeight(userDetails.getUserHeight());
        user.setUserSpecialization(userDetails.getUserSpecialization());
        user.setUserJobFunction(userDetails.getUserJobFunction());
        user.setUserConsent(userDetails.isUserConsent());
        user.setUserDateConsent(userDetails.getUserDateConsent());
        user.setUserActive(userDetails.isUserActive());
        user.setUserCreatedAt(userDetails.getUserCreatedAt());

        return usersRepository.save(user);
    }

    public void delete(UUID id){
        Users user = findById(id);
        usersRepository.delete(user);
    }

}
