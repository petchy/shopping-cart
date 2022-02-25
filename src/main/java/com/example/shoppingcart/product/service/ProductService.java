package com.example.shoppingcart.product.service;


import com.example.shoppingcart.product.model.Product;
import com.example.shoppingcart.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProduct(String title) {
        List <Product> result = productRepository.findProductsByTitle(title);
        return result;
    }

    public Optional<Product> getDetail(Integer id) {
        Optional<Product> result = productRepository.findById(id);
        return result;
    }
}
