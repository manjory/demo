package com.example.demo.controller;

import com.example.demo.model.Person;

public interface PersonApi {
    Person getPerson(String id);
    Person setPerson(Person person );
}
