package com.paw2go.adminsusers.admin;
import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_admin;
    @Column
    private String adminUsername;
    @Column
    private String admin_password;
    @Column
    private String admin_email;

    //Getter and Setters


    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    public String getAdmin_username() {
        return adminUsername;
    }

    public void setAdmin_username(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }


}