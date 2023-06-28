package com.Yours.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "car")
public class Car {

    @Id
    private String idCar;
    private String carName;
    private String carBrand;
    private String CarType;

}
