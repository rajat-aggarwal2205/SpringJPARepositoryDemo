package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.ProductDAO;
import com.example.model.Product;
import com.example.model.ProductType;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner{

    private ProductDAO productDAO;

    @Autowired
    public SpringBootJpaApplication(ProductDAO productDAO) {
        super();
        this.productDAO = productDAO;
    }
    @Override
    public void run(String... args) throws Exception {

        Product product1=new Product("Book",80);
        Product product2=new Product("Electronics", 280);
        Product product3=new Product("Cosmetics", 10);
        productDAO.createProduct(product1);
        productDAO.createProduct(product2);
        productDAO.createProduct(product3);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

}
