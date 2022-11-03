package Edu.Entity.Service.Implementation;

import Edu.Entity.Product;
import Edu.Entity.Repository.ProductRepo;
import Edu.Entity.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired

    private ProductRepo productRepo;


    @Override
    public Product getById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAllByPriceGreaterThan(double price) {
      return productRepo.getAllByPriceGreaterThan(price);
    }
}
