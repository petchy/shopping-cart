package com.example.shoppingcart.product.service;

import com.example.shoppingcart.product.model.Product;
import com.example.shoppingcart.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test
    void searchProduct() {
        //Arrange
        Product product = new Product();
        product.setTitle("adidas ultraboost");
        product.setProductCode("P001");
        product.setImageUrl("https://adidas.com/ultraboost-climacool-1-dna.jpg");
        product.setRating(5);
        product.setRatingTotal(10);
        product.setPriceNormal(Float.valueOf(200));
        product.setPricePromotion(Float.valueOf(180));
        product.setDiscountPercent(Float.valueOf(10));
        product.setStoreProvince(1);
        when(productRepository.findProductsByTitle("adidas")).thenReturn(List.of(product));
        //Act
        ProductService productService = new ProductService();
        productService.setProductRepository(productRepository);
        List<Product> result = productService.searchProduct("adidas");

        //Assert
        assertEquals(1, result.size());
        assertEquals("adidas ultraboost", result.get(0).getTitle());
    }
}