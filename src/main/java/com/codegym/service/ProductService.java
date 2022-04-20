package com.codegym.service;

import com.codegym.dao.IProductDAO;
import com.codegym.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public void removeById(Long id) {
        productDAO.removeById(id);
    }
}
