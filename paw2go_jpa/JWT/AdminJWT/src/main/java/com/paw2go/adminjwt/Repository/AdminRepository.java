package com.paw2go.adminjwt.Repository;

import com.paw2go.adminjwt.Model.Admin;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called adminRepository
// CRUD refers Create, Read, Update, Delete

public interface AdminRepository extends CrudRepository<Admin, Integer> {
    Admin findByIdAdmin(int id);
    Admin findByAdminUsername(String Username);
}
