package uk.ac.iit.product.api;

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
}
