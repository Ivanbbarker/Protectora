package com.aplication.protectora.Model;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;



@Entity
@Table(name = "users")
public class Users {
    
    @Id // Indica que este campo es la clave primaria de la entidad (en este caso, la clase User)
    @GeneratedValue(generator = "UUID") // Indica que el valor de este campo se generará automáticamente utilizando el generador "UUID"
    @GenericGenerator(
        name = "UUID", // Define el nombre del generador genérico, que se utilizará en la anotación @GeneratedValue
        strategy = "org.hibernate.id.UUIDGenerator" // Define la estrategia de generación de UUIDs que se utilizará (en este caso, la estrategia de generación de UUID de Hibernate)
    )
    @Type(type="org.hibernate.type.UUIDBinaryType") // Especifica el tipo de mapeo de Hibernate para este campo (en este caso, un tipo binario de UUID)
    @Column(name = "id", columnDefinition = "BINARY(16)", updatable = false, nullable = false, unique = true) // Proporciona información adicional sobre cómo mapear este campo a una columna de la base de datos
    private UUID id; // Declara la variable 'id' de tipo UUID (Universally Unique Identifier)    

    @Column(name = "name")
    private String userName;

    @Column(name = "surname")
    private String userSurname;

    @Column(name = "dni")
    private String userDni;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate userBirthDate;//solo fecha

    @Email
    @Column(name = "email")
    private String emailUser;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "phone")
    private int userPhone;

    @Column(name = "address")
    private String userAddress;

    @Column(name = "city")
    private String userCity;

    @Column(name = "country")
    private String userCountry;

    @Column(name = "postal_code")
    private int userPostalCode;

    @Column(name = "role")
    private String userRole;

    @Column(name = "weigth")
    private double userWeigth;

    @Column(name="specialization")
    private String userSpecialization;

    @Column(name="jobFunction")
    private String userJobFunction;

    @Column(name = "height")
    private double userHeight;

    @Column(name = "consent")
    private boolean userConsent;

    @Column(name = "date_consent")
    private LocalDateTime userDateConsent;

    @Column(name = "active")
    private boolean userActive;

    @Column(name = "created_at")
    private LocalDateTime userCreatedAt;

    public Users() {
    }

    public Users(UUID id, String userName, String userSurname, String userDni, LocalDate userBirthDate,@Email String emailUser, String userPassword, int userPhone, String userAddress, String userCity, String userCountry, int userPostalCode, String userRole, double userWeigth, String userSpecialization, String userJobFunction, double userHeight, boolean userConsent, LocalDateTime userDateConsent, boolean userActive, LocalDateTime userCreatedAt) {
        this.id = id;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userDni = userDni;
        this.userBirthDate = userBirthDate;
        this.emailUser = emailUser;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userCountry = userCountry;
        this.userPostalCode = userPostalCode;
        this.userRole = userRole;
        this.userWeigth = userWeigth;
        this.userSpecialization = userSpecialization;
        this.userJobFunction = userJobFunction;
        this.userHeight = userHeight;
        this.userConsent = userConsent;
        this.userDateConsent = userDateConsent;
        this.userActive = userActive;
        this.userCreatedAt = userCreatedAt;
    }


    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }


    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return this.userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserDni() {
        return this.userDni;
    }

    public void setUserDni(String userDni) {
        this.userDni = userDni;
    }

    public LocalDate getUserBirthDate() {
        return this.userBirthDate;
    }

    public void setUserBirthDate(LocalDate userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public String getEmailUser() {
        return this.emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCity() {
        return this.userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserCountry() {
        return this.userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public int getUserPostalCode() {
        return this.userPostalCode;
    }

    public void setUserPostalCode(int userPostalCode) {
        this.userPostalCode = userPostalCode;
    }

    public String getUserRole() {
        return this.userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public double getUserWeigth() {
        return this.userWeigth;
    }

    public void setUserWeigth(double userWeigth) {
        this.userWeigth = userWeigth;
    }

    public String getUserSpecialization() {
        return this.userSpecialization;
    }

    public void setUserSpecialization(String userSpecialization) {
        this.userSpecialization = userSpecialization;
    }

    public String getUserJobFunction() {
        return this.userJobFunction;
    }

    public void setUserJobFunction(String userJobFunction) {
        this.userJobFunction = userJobFunction;
    }

    public double getUserHeight() {
        return this.userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public boolean isUserConsent() {
        return this.userConsent;
    }

    public boolean getUserConsent() {
        return this.userConsent;
    }

    public void setUserConsent(boolean userConsent) {
        this.userConsent = userConsent;
    }

    public LocalDateTime getUserDateConsent() {
        return this.userDateConsent;
    }

    public void setUserDateConsent(LocalDateTime userDateConsent) {
        this.userDateConsent = userDateConsent;
    }

    public boolean isUserActive() {
        return this.userActive;
    }

    public boolean getUserActive() {
        return this.userActive;
    }

    public void setUserActive(boolean userActive) {
        this.userActive = userActive;
    }

    public LocalDateTime getUserCreatedAt() {
        return this.userCreatedAt;
    }

    public void setUserCreatedAt(LocalDateTime userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

    public Users id(UUID id) {
        setId(id);
        return this;
    }

    public Users userName(String userName) {
        setUserName(userName);
        return this;
    }

    public Users userSurname(String userSurname) {
        setUserSurname(userSurname);
        return this;
    }

    public Users userDni(String userDni) {
        setUserDni(userDni);
        return this;
    }

    public Users userBirthDate(LocalDate userBirthDate) {
        setUserBirthDate(userBirthDate);
        return this;
    }

    public Users emailUser(String emailUser) {
        setEmailUser(emailUser);
        return this;
    }

    public Users userPassword(String userPassword) {
        setUserPassword(userPassword);
        return this;
    }

    public Users userPhone(int userPhone) {
        setUserPhone(userPhone);
        return this;
    }

    public Users userAddress(String userAddress) {
        setUserAddress(userAddress);
        return this;
    }

    public Users userCity(String userCity) {
        setUserCity(userCity);
        return this;
    }

    public Users userCountry(String userCountry) {
        setUserCountry(userCountry);
        return this;
    }

    public Users userPostalCode(int userPostalCode) {
        setUserPostalCode(userPostalCode);
        return this;
    }

    public Users userRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    public Users userWeigth(double userWeigth) {
        setUserWeigth(userWeigth);
        return this;
    }

    public Users userSpecialization(String userSpecialization) {
        setUserSpecialization(userSpecialization);
        return this;
    }

    public Users userJobFunction(String userJobFunction) {
        setUserJobFunction(userJobFunction);
        return this;
    }

    public Users userHeight(double userHeight) {
        setUserHeight(userHeight);
        return this;
    }

    public Users userConsent(boolean userConsent) {
        setUserConsent(userConsent);
        return this;
    }

    public Users userDateConsent(LocalDateTime userDateConsent) {
        setUserDateConsent(userDateConsent);
        return this;
    }

    public Users userActive(boolean userActive) {
        setUserActive(userActive);
        return this;
    }

    public Users userCreatedAt(LocalDateTime userCreatedAt) {
        setUserCreatedAt(userCreatedAt);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userName='" + getUserName() + "'" +
            ", userSurname='" + getUserSurname() + "'" +
            ", userDni='" + getUserDni() + "'" +
            ", userBirthDate='" + getUserBirthDate() + "'" +
            ", emailUser='" + getEmailUser() + "'" +
            ", userPassword='" + getUserPassword() + "'" +
            ", userPhone='" + getUserPhone() + "'" +
            ", userAddress='" + getUserAddress() + "'" +
            ", userCity='" + getUserCity() + "'" +
            ", userCountry='" + getUserCountry() + "'" +
            ", userPostalCode='" + getUserPostalCode() + "'" +
            ", userRole='" + getUserRole() + "'" +
            ", userWeigth='" + getUserWeigth() + "'" +
            ", userSpecialization='" + getUserSpecialization() + "'" +
            ", userJobFunction='" + getUserJobFunction() + "'" +
            ", userHeight='" + getUserHeight() + "'" +
            ", userConsent='" + isUserConsent() + "'" +
            ", userDateConsent='" + getUserDateConsent() + "'" +
            ", userActive='" + isUserActive() + "'" +
            ", userCreatedAt='" + getUserCreatedAt() + "'" +
            "}";
    }

}
