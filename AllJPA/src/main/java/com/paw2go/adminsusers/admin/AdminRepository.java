package com.paw2go.adminsusers.admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByAdminUsername(String adminUsername);
}