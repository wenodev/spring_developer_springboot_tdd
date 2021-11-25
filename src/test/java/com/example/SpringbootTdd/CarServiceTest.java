package com.example.SpringbootTdd;

import com.example.SpringbootTdd.domain.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class CarServiceTest {

    private CarRepository carRepository = mock(CarRepository.class);
    private CarService carService = new CarService(carRepository);

    @Test
    void details메소드는_차이름이존재한다면_차를리턴한다(){
        //arrange
        given(carRepository.findByName("prius")).willReturn(new Car("prius", "hybrid"));

        //act
        Car car = carService.details("prius");

        //assert
        assertThat(car.getType()).isEqualTo("hybrid");
    }

    @Test
    void details메소드는_이름이존재하지않는다면_예외를발생시킨다(){
        //arrange
        given(carRepository.findByName("prius")).willReturn(new Car("prius", "hybrid"));

        assertThatThrownBy(() ->
                //act
                carService.details("prius1"))

                //asert
                .isInstanceOf(CarNotFoundException.class);
    }

}