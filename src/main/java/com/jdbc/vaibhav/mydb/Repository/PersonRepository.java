package com.jdbc.vaibhav.mydb.Repository;

import com.jdbc.vaibhav.mydb.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        personList = jdbcTemplate.query("SELECT * FROM PERSON",  new BeanPropertyRowMapper<Person>(Person.class));
        return personList;
    }

}
