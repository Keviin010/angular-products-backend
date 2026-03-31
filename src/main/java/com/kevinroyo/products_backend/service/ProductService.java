package com.kevinroyo.products_backend.service;

import com.kevinroyo.products_backend.models.Product;
import com.kevinroyo.products_backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Optional<Product> getById(Integer id) {
        return repository.findById(id);
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product update(Integer id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}