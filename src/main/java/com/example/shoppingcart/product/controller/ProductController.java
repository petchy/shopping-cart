package com.example.shoppingcart.product.controller;

import com.example.shoppingcart.product.model.Product;
import com.example.shoppingcart.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService = new ProductService();

    @GetMapping("/api/product")
    public List<Product> searchProduct(@RequestParam("title") String title) {
        List<Product> result = productService.searchProduct(title);
        return result;
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> detail(@PathVariable("id") Integer id) {
        Optional<Product> result = productService.getDetail(id);
        return result;
    }
}
