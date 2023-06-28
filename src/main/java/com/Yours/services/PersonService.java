package com.Yours.services;

import com.Yours.models.entities.PersonID;

import java.util.List;

public interface PersonService {

    List<PersonID> personList();

    PersonID addNewPerson(PersonID request);

    String updatePerson(PersonID request, String idPerson);

    boolean deletePerson(String idPerson);

    boolean ubahStatus(String idPerson, boolean isNewPerson);
}
