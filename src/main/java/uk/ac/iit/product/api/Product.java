package uk.ac.iit.product.api;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, double price ){
        this.id =id;
        this.name =name;
        this.price= price;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
