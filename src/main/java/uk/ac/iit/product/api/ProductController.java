
package uk.ac.iit.product.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProdutById(id).orElse(null);
    }

    @PostMapping("/products")
    public Product addProdut(@RequestBody Product product){
        return productService.addProdut(product);
    }



    @DeleteMapping("/products/{id}")
    public void DeleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}
