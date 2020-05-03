package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonService {
    Person getService(String id);
    Person setService(Person person);
}
