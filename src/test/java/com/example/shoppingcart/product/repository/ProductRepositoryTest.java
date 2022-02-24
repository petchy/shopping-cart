package com.example.shoppingcart.product.repository;

import com.example.shoppingcart.product.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void findProductsByTitleSuccess() {
        //Act
        List<Product> result = productRepository.findProductsByTitle("adidas");
        //Assert
        assertTrue(!result.isEmpty());
        assertEquals(5, result.size());
    }

    @Test
    void findProductsByTitleFail() {
        //Act
        List<Product> result = productRepository.findProductsByTitle("nike");
        //Assert
        assertTrue(result.isEmpty());
    }
}