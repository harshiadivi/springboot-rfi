package com.learn.first_web_app.repository;

import com.learn.first_web_app.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//jpa
//JPA (Java Persistence API) for mapping Java objects to relational database tables and vice versa
@Repository
//jpa repository has all the methods
public interface ProductRepo extends JpaRepository< Product , Integer> {
    //entity , ID

}



