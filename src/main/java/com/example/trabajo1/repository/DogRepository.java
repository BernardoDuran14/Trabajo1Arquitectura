package com.example.trabajo1.repository;

import com.example.trabajo1.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
