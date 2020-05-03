package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
//@RequestMapping(path="/person")
class PersonApiImpl implements PersonApi {

    @Autowired
    PersonServiceImpl personService;

    public PersonApiImpl() {
        System.out.println("Starting Person API's");
    }

    @Override
//    @GET
//    @Path("/{id}")
    @RequestMapping(path = "/person/{id}", method = RequestMethod.GET, produces = {
            "application/JSON"
    })
    public Person getPerson(@PathVariable String id) {

        System.out.println(id);

        return personService.getService(id);
    }

    @Override
//    @Path("{id}")
    @RequestMapping(path = "/person/set/{id}", method = RequestMethod.POST, consumes = {
            "application/JSON",
            "application/XML"
    }, produces = {
            "application/JSON"
    })

    public Person setPerson(@RequestBody  Person person) {
        System.out.println(person);
        return personService.setService(person);
    }

    @RequestMapping(path = "/person/{id}", method = RequestMethod.PUT, consumes = {
            "application/JSON",
            "application/XML"
    }, produces = {
            "application/JSON"
    })

    public Person updatePerson(Person person) {
        System.out.println(person);
        return person;
    }

    @RequestMapping(path = "/person/{id}", method = RequestMethod.DELETE)

    public Person deletePerson(String id) {
        System.out.println(id);
        return null;
    }


    @RequestMapping(path = "/person/{id}", method = RequestMethod.PATCH, consumes = {
            "application/JSON",
            "application/XML"
    }, produces = {
            "application/JSON"
    })

    public Person patchPerson(Person person) {
        System.out.println(person);
        return person;
    }
}
