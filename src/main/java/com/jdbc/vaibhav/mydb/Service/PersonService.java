package com.jdbc.vaibhav.mydb.Service;



import com.jdbc.vaibhav.mydb.Model.Person;
import com.jdbc.vaibhav.mydb.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPersons(){
        List<Person> list = personRepository.findAll();
        return list;
    }
//
//    public Person findById(long id){
//        return personRepository.findById(id).orElse(null);
//    }
}
