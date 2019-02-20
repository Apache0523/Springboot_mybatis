package com.example.service.serviceImpl;

import com.example.bean.Person;
import com.example.dao.PersonMapper;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> getAllPerson(){
        return personMapper.selectByExample(null);
    }
}
