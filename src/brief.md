# Lab: One To Many and Many to Many

**Lab Duration: 90 minutes**

### Learning Objectives

- Understand the relationships, one to many and many to many.
- Be able to implement one-to-many and many-to-many relationships between com.codeclan.example.Employee.Relationships.Lab.models with Spring JPA + Hibernate

## Introduction

In this lab, use what you've learned about **one-to-many** and **many-to-many** to create an application for a company to track their employees, departments and projects.

## Task

### MVP

A `Department` must have one-to-many with `com.codeclan.example.Employee.Relationships.Lab.models.Employee`: A `Department` has many `com.codeclan.example.Employee.Relationships.Lab.models.Employee`s. An `com.codeclan.example.Employee.Relationships.Lab.models.Employee` must have a many-to-many with a `Project`: Many `com.codeclan.example.Employee.Relationships.Lab.models.Employee`s can be part of a `Project` and a `Project` can have many different `com.codeclan.example.Employee.Relationships.Lab.models.Employee`s in it.

Implement the following com.codeclan.example.Employee.Relationships.Lab.models to achieve the above relationships:

An com.codeclan.example.Employee.Relationships.Lab.models.Employee must:

- have a first name
- have last name
- have an employee number
- be able to be assigned to multiple projects

A Department must:

- have a name
- be able to add multiple employees

A Project must

- have a name
- have a duration in number of days
- be able to add multiple employees


## Planning

Draw a diagram modelling the relationships between the com.codeclan.example.Employee.Relationships.Lab.models. Study the previous two lessons on **one-to-many** and **many-to-many** to help you.

This lab requires two relationships to be setup, it's a good idea to complete one relationship at a time.

Remember to create a `JpaRepository` for each model.
