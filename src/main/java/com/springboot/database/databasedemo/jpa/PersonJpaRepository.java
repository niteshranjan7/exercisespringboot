package com.springboot.database.databasedemo.jpa;

import com.springboot.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//Repository
@Repository
//Transaction
@Transactional
public class PersonJpaRepository {

    //Connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){
        return entityManager.find(Person.class, id);//JPA
    }
}
