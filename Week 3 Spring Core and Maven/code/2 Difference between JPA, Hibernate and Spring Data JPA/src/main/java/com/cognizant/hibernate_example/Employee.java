package com.cognizant.hibernate_example;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;

    public void setName(String name) {
        this.name=name;
    }


    public void setDepartment(String department) {
    this.department=department;
    }
}
