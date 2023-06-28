package com.Yours.services;

import com.Yours.models.entities.Car;
import com.Yours.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> carList() {
        return carRepository.findAll();
    }

    @Override
    public Car addNewCar(Car request) {
        carRepository.save(request);
        return request;
    }

    @Override
    public String updateCar(Car request, String idCar) {
       final Optional<Car> result =  carRepository.findById(idCar);
       if (result.isPresent()){
           Car car = result.get();
           car.setCarName(request.getCarName());
           car.setCarBrand(request.getCarBrand());
           car.setCarType(request.getCarType());
           carRepository.save(car);
           return "Data Berhasil Terupdate";
       }else{
           return "Data Gagal Terupdate";
       }
    }

    @Override
    public String deleteCar(String idCar) {
        final Optional<Car> result = carRepository.findById(idCar);
        if (result.isPresent()){
            Car car = result.get();
            carRepository.delete(car);
            return "Berhasil Terhapus";
        }else{
            return "Gagal Terhapus";
        }
    }
}
