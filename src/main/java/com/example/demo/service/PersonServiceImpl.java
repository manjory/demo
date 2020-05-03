package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonServiceImpl implements  PersonService {

    @Autowired
    PersonRepository personRepository;
    public PersonServiceImpl(){
        System.out.println("PersonServiceImpl");
    }

    @Override
    public Person getService(String id) {
        Person person = new Person();
        person.setId(id);
        person.setAddress("455 brahms");
        person.setFirstName("1");
        person.setLastName("Sony");
        person.setPhoneNumber("00000000");
        return person;
    }

    @Override
    @Transactional
    public Person setService(Person person) {
        return personRepository.saveAndFlush(person);

    }
}
