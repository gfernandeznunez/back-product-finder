package com.walmart.search.dao;

import com.walmart.search.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepo extends MongoRepository<Product,String> {
    public List<Product> findById(int id);
    List<Product> findByBrandOrDescriptionLike(String brand, String description);

    default List<Product> findByBrandOrDescription(String value){
        return findByBrandOrDescriptionLike(value, value);
    }

}
