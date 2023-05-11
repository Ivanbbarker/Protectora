package com.aplication.protectora.Controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aplication.protectora.Model.Users;
import com.aplication.protectora.Services.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    public String formatLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return dateTime.format(formatter);
    }

    // Crear un nuevo user (POST)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Users> createUser(@ModelAttribute Users user) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        user.setUserDateConsent(currentDateTime);
        user.setUserCreatedAt(currentDateTime);
        Users newUser = userService.save(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    // Actualizar un user existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable UUID id, @RequestBody Users user) {
        Users updatedUser = userService.update(id, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Obtener todos los Usuarios (GET)
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Obtener un user por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable UUID id) {
        Users user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Obtener user para editar en html
    @GetMapping("/detalle/{id}")
    public String verUserDetalle(@PathVariable UUID id, Model model) {
        Users user = userService.findById(id);
        model.addAttribute("user", user);
        model.addAttribute("userDateConsentFormatted", formatLocalDateTime(user.getUserDateConsent()));
        model.addAttribute("userCreatedAtFormatted", formatLocalDateTime(user.getUserCreatedAt()));
        return "/views/Users/user-detail";
    }

    // Eliminar un User por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Creando la interfaz web
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    // obtener listado de usuarios
    @GetMapping("/listado-users")
    public String listarUsers(Model model) {
        List<Users> users = userService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("user", new Users()); // Añade esta línea
        return "/views/Users/listado-users";
    }
}
