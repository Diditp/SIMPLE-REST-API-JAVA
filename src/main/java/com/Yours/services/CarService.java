package com.Yours.services;

import com.Yours.models.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> carList();

    Car addNewCar(Car request);

    String updateCar(Car request, String idCar);

    String deleteCar(String idCar);

}
