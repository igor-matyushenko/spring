package com.accenture.flowershopNew.be.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
public class Customer implements Serializable {
    Long id;
    String firstName;
    String secondName;
    int age;

    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ", allocationSize = 1)
    @Column(name = "ID_USER")
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "SECOND_NAME")
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Column(name = "AGE")
    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}
