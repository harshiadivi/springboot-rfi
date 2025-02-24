/*
package com.learn.first_web_app.service;

import com.learn.first_web_app.model.Product;
import com.learn.first_web_app.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
//narks class as service contains all business logic
public class ProductService {

    //List<Product> products = new ArrayList<>(Arrays.asList(new Product(101 , "iphone", 50000) , new Product(102 , "samsung" , 70000)));
//    public List<Product> getProducts()
//    {
//        return products;
//    }

    @Autowired
    ProductRepo repo;
    public List<Product> getProducts()
    {
       return repo.findAll();
    }

//    public Product getProductById(int prodID){
//        return products.stream().filter(p->p.getProductID() == prodID).findFirst().get();
//    }

    public Product getProductById(int prodID){
        return repo.findById(prodID).orElse(new Product());

    }


    //maps product you are adding from client side to server
//    public void addProduct(Product prod)
//    {
//        products.add(prod);
//
//    }

    public void addProduct(Product prod)
    {
        repo.save(prod);
    }


//    public void updateProduct( Product prod) {
//        int idx=0;
//        for(int i = 0 ; i< products.size() ; i++)
//        {
//            if(products.get(i).getProductID()== prod.getProductID())
//                idx=i;
//        }
//        products.set(idx , prod);
//
//    }
    public void updateProduct( Product prod) {
        repo.save(prod);
    }

//    public void deleteProduct(int prodID) {
//        int idx=0;
//        for(int i = 0 ; i< products.size() ; i++)
//        {
//            if(products.get(i).getProductID()== prodID)
//                idx=i;
//        }//After the loop, the product in the list at index idx is replaced with the new prod object using the set method.
//
//
//        products.remove(idx);
//    }
public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
}

}
*/