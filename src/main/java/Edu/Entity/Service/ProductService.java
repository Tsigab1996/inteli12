package Edu.Entity.Service;

import Edu.Entity.Product;

import java.util.List;

public interface ProductService {
    Product getById(int id);
    List<Product> getAllByPriceGreaterThan(double price);
}
