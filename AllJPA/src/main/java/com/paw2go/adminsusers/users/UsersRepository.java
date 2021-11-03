package com.paw2go.adminsusers.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    Users findByUserName(String userName);
}
