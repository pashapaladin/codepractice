package com.p1;

public class Owner {
    private String fullName;
    private String email;
    private String password;
    private String animalName;
    private String animalType;

    // Constructor
    public Owner(String fullName, String email, String password, String animalName, String animalType) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.animalName = animalName;
        this.animalType = animalType;
    }

    // Getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
