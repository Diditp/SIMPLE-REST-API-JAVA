package com.Yours.models.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "personID")
public class PersonID {

    @Id
    private String idPerson;
    private String name;
    private String gender;
    private int phoneNumber;
    private boolean isNewPerson;
}
