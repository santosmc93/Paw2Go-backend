package com.paw2go.adminsusers.doggrooming;

import com.paw2go.adminsusers.doggrooming.Doggrooming;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogDAO extends JpaRepository<Doggrooming, Integer> {
}
