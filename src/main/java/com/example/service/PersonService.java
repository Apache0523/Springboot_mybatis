package com.example.service;

import com.example.bean.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
}
