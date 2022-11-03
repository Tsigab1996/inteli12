package Edu.Entity.Controller;

import Edu.Entity.Product;
import Edu.Entity.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
   private ProductService productService;

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id){
      return productService.getById(id);
    }

    @GetMapping("/filter")

    public List<Product> getByPrice(double price){
        return productService.getAllByPriceGreaterThan(price);
    }

}
