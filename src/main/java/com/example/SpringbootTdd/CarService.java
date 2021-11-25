package com.example.SpringbootTdd;

import com.example.SpringbootTdd.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car details(String name) {
        return carRepository.findByName(name);
    }
}
