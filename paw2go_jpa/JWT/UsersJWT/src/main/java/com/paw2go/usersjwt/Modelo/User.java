package com.paw2go.usersjwt.Modelo;

import javax.persistence.*;

// Adaptacion lista

@Entity(name="users") // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idUsers;
    @Column
    private String fullName;
    @Column
    private String email;
    @Column
    private String userName;
    @Column
    private String password;

    public User(Integer idUsers, String fullName, String email, String userName, String password) {
        this.idUsers = idUsers;
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User(){

    }

    public Integer getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Integer idUsers) {
        this.idUsers = idUsers;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
