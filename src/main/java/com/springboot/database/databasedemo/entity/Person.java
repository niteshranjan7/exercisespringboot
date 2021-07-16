package com.springboot.database.databasedemo.entity;

//import java.sql.Date;
import javax.persistence.*;
import java.util.Date;

//--JPA--
@Entity
//--@Table(name="person") -> commenting this bcoz here table name and class name is same--
public class Person {
    //-- --
    @Id
    @GeneratedValue
    private int id;
    //--@Column(name="name") -> commenting this bcoz here column name is same--

    private String name;
    private String location;
    private Date birthDate;

    //No argument constructor
    public Person(){

    }

    //Since we provided java will not provide default constructor, so adding above

    public Person(int id, String name, String location, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    //-- Id will be auto created as part of Hibernate --
    public Person(String name, String location, Date birthDate) {
        super();
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
