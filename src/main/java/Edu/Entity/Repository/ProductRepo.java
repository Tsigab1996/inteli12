package Edu.Entity.Repository;

import Edu.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo  extends CrudRepository<Product, Integer> {

    //These methods will create a query
    List<Product> findAllByPriceGreaterThan(double price);
    List<Product> findAllByDescriptionContaining(String regex);
    List<Product> getAllByPriceGreaterThan(double price);
}
