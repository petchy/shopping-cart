package com.example.shoppingcart.product.repository;

import com.example.shoppingcart.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value="select * from Product where title like %:title% limit 5", nativeQuery=true)
    List<Product> findProductsByTitle(@Param("title") String title);

}
