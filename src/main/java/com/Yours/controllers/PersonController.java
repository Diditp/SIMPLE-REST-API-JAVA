package com.Yours.controllers;

import com.Yours.models.entities.PersonID;
import com.Yours.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/personID")
public class PersonController {

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    PersonService personService;

    @GetMapping(path = "/personList")
    public List<PersonID> personList(){
        return personService.personList();
    }

    @PostMapping(path = "/addPerson")
    public PersonID addNewPerson(@RequestBody PersonID request){
        return personService.addNewPerson(request);
    }

    @PutMapping(path = "/updatePerson/{idPerson}")
    public String updatePerson(@RequestBody PersonID request, @PathVariable String idPerson){
        return personService.updatePerson(request, idPerson);
    }

    @DeleteMapping(path = "/deletePerson/{idPerson}")
    public boolean deletePerson(@PathVariable String idPerson){
        return personService.deletePerson(idPerson);
    }

    @PatchMapping(path = "/changeStatus/{idPerson}")
    public boolean ubahStatus(@PathVariable String idPerson, @RequestParam boolean isNewPerson){
        return personService.ubahStatus(idPerson, isNewPerson);
    }
}