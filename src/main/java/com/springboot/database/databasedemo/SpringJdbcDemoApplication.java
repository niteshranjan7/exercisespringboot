package com.springboot.database.databasedemo;

import com.springboot.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import com.springboot.database.databasedemo.entity.Person;
import com.springboot.database.databasedemo.jdbc.PersonJdbcDAO;

import java.util.Date;


//-- --
//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	//query return value need to be printed in console
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	//method of command line runner

	@Override
	public void run(String... args) throws Exception {
		//this will fire query
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("Deleting 10002 -> No of rows deleted{}", dao.deleteById(10002));
		logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Avdhesh", "DL", new Date())));
		logger.info("Update 10003 -> {}", dao.update(new Person(10003, "Shilpi", "BR", new Date())));

	}
}
