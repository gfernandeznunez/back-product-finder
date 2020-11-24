package com.walmart.search.dao;

import com.walmart.search.model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findByBrandOrDescription(String value);
    List<Product> findById(int id);

}
