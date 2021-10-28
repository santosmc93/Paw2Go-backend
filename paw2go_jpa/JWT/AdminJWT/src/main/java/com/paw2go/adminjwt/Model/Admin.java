package com.paw2go.adminjwt.Model;

import javax.persistence.*;

// Adaptacion lista

@Entity(name="admin") // This tells Hibernate to make a table out of this class
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idAdmin;
    @Column
    private String adminUsername;
    @Column
    private String adminName;
    @Column
    private String adminPassword;
    @Column
    private String adminEmail;

    public Admin(Integer idAdmin, String adminUsername, String adminName, String adminPassword, String adminEmail) {
        this.idAdmin = idAdmin;
        this.adminUsername = adminUsername;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail;
    }

    public Admin(){

    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
}

