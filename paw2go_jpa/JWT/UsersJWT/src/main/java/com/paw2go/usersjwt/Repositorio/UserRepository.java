package com.paw2go.usersjwt.Repositorio;

import com.paw2go.usersjwt.Modelo.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByIdUsers(int id);
    User findByUserName(String Username);
}
