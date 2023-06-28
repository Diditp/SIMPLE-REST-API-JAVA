package com.Yours.controllers;

import com.Yours.models.entities.Car;
import com.Yours.services.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    CarServiceImpl carService;

    @GetMapping(path = "/carList")
    public List<Car> carList(){
        return carService.carList();
    }

    @PostMapping(path = "/addNewCar")
    public Car addNewCar(@RequestBody Car request){
       return carService.addNewCar(request);
    }

    @PutMapping(path = "/updateCar/{idCar}")
    public String updateCar(@RequestBody Car request, @PathVariable String idCar){
        return carService.updateCar(request, idCar);
    }

    @DeleteMapping(path = "/deleteCar/{idCar}")
    public String deleteCar(@PathVariable String idCar){
        return carService.deleteCar(idCar);
    }
}
