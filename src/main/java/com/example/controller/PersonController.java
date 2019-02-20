package com.example.controller;

import com.example.bean.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/getAllPerson")
    public String getAllPerson(Model model){
        List<Person> list = personService.getAllPerson();
        model.addAttribute("list",list);
        return "list";
    }
}
