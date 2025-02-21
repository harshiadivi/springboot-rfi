package com.learn.first_web_app.model;


//import lombok.AllArgsConstructor;
//import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
//creates beans
@Entity //when uou want a class to be in form of table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodID;


    private String prodName;
    private int price;

    public Product()
    {

    }
    public Product(int prodID, String prodName, int price) {
//        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductID() {
        return prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

//    public void setProductID(int prodID) {
//        this.prodID = prodID;
//    }

    public void setPrice(int price) {
        this.price = price;
    }
}

