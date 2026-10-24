
package uk.ac.iit.product.api;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(DigitalProduct.class),
        @JsonSubTypes.Type(ProductService.class)
})

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private  long nextId =1L;

    public ProductService() {
        products.add(new Product(1L, "Laptop", 899.99));
        products.add(new Product(2L, "Mouse", 24.99));
        products.add(new Product(3L, "Mug", 8.50));
        products.add(new DigitalProduct(
                nextId++,"Cleaner",29.0,"Pd",4
        ));
        products.add(new PhysicalProduct(
                nextId++,"Cleaner",29.0,8,"circle"
        ));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProdutById(Long id){
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public Product addProdut(Product product) {
        products.add(product);
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
