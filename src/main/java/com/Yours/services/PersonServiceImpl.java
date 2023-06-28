package com.Yours.services;

import com.Yours.models.entities.PersonID;
import com.Yours.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<PersonID> personList() {
        return personRepository.findAll();
    }

    @Override
    public PersonID addNewPerson(PersonID request) {
        personRepository.save(request);
        return request;
    }

    @Override
    public String updatePerson(PersonID request, String idPerson) {
        final Optional<PersonID> result = personRepository.findById(idPerson);
        if(result.isPresent()){
            result.get().setName(request.getName());
            result.get().setPhoneNumber(request.getPhoneNumber());
            personRepository.save(result.get());
            return "Data Update Succsesfully";
        }else{
            return "Failed To Update Data";
        }
    }

    @Override
    public boolean deletePerson(String idPerson) {
        final Optional<PersonID> result = personRepository.findById(idPerson);
        if(result.isPresent()){
            PersonID personID = result.get();
            personRepository.delete(personID);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean ubahStatus(String idPerson, boolean isNewPerson) {
        final Optional<PersonID> result = personRepository.findById(idPerson);
       if(result.isPresent()){
           PersonID personID = result.get();
           personID.setNewPerson(isNewPerson);
           personRepository.save(personID);
           return true;
       }else{
           return false;
       }
    }
}
