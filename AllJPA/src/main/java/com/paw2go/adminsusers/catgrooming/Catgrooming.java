package com.paw2go.adminsusers.catgrooming;

import javax.persistence.*;

@Entity (name = "catgrooming")
public class Catgrooming {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_cat;
    @Column
    private String cat_name;
    @Column
    private String cat_breed;
    @Column
    private Integer cat_age;
    @Column
    private String cat_appointment;
    @Column
    private String extra_instructions;

    // setters and getters


    public Integer getId() {
        return id_cat;
    }

    public void setId(Integer id) {
        this.id_cat = id_cat;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getCat_breed() {
        return cat_breed;
    }

    public void setCat_breed(String cat_breed) {
        this.cat_breed = cat_breed;
    }

    public Integer getCat_age() {
        return cat_age;
    }

    public void setCat_age(Integer cat_age) {
        this.cat_age = cat_age;
    }

    public String getCat_appointment() {
        return cat_appointment;
    }

    public void setCat_appointment(String cat_appointment) {
        this.cat_appointment = cat_appointment;
    }

    public String getExtra_instructions() {
        return extra_instructions;
    }

    public void setExtra_instructions(String extra_instructions) {
        this.extra_instructions = extra_instructions;
    }
}