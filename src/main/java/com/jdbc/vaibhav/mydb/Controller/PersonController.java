package com.jdbc.vaibhav.mydb.Controller;


import com.jdbc.vaibhav.mydb.Model.Person;
import com.jdbc.vaibhav.mydb.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static javax.servlet.http.HttpServletResponse.SC_OK;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;


    @RequestMapping("/api/all")
    public ResponseEntity<List<Person>> getAll(){
        List<Person> list = personService.getAllPersons();
        return ResponseEntity.status(SC_OK).body(list);
    }
}
