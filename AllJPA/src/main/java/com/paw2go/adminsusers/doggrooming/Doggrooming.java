package com.paw2go.adminsusers.doggrooming;

import javax.persistence.*;

@Entity (name = "doggrooming")
public class Doggrooming {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_dog;
    @Column
    private String dog_name;
    @Column
    private String dog_breed;
    @Column
    private Integer dog_age;
    @Column
    private String dog_appointment;
    @Column
    private String extra_instructions;

    // setters and getters


    public Integer getId_dog() {
        return id_dog;
    }

    public void setId_dog(Integer id_dog) {
        this.id_dog = id_dog;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getDog_breed() {
        return dog_breed;
    }

    public void setDog_breed(String dog_breed) {
        this.dog_breed = dog_breed;
    }

    public Integer getDog_age() {
        return dog_age;
    }

    public void setDog_age(Integer dog_age) {
        this.dog_age = dog_age;
    }

    public String getDog_appointment() {
        return dog_appointment;
    }

    public void setDog_appointment(String dog_appointment) {
        this.dog_appointment = dog_appointment;
    }

    public String getExtra_instructions() {
        return extra_instructions;
    }

    public void setExtra_instructions(String extra_instructions) {
        this.extra_instructions = extra_instructions;
    }
}