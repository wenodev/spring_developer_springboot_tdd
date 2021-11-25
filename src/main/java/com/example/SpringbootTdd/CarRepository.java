package com.example.SpringbootTdd;

import com.example.SpringbootTdd.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByName(String prius);
}
