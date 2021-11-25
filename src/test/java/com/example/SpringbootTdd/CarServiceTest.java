package com.example.SpringbootTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CarServiceTest {

    private CarRepository carRepository = mock(CarRepository.class);
    private CarService carService = new CarService(carRepository);

    @Test
    void details메소드는_차이름이존재한다면_차를리턴한다(){
        carService.details()
    }

}