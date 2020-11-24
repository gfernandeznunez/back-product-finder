package com.walmart.search.dao;

import com.walmart.search.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{

    @Autowired
    private ProductRepo repo;

    @Override
    public List<Product> findByBrandOrDescription(String value) {
        return repo.findByBrandOrDescription(value);
    }

    @Override
    public List<Product> findById(int id) {
        return repo.findById(id);
    }
}
