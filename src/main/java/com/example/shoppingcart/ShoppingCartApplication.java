package com.example.shoppingcart;

import com.example.shoppingcart.product.model.Product;
import com.example.shoppingcart.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingCartApplication {
	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void initialProductData() {
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
		productRepository.save(product);

		Product product2 = new Product();
		product2.setTitle("adidas superstar");
		product2.setProductCode("P002");
		product2.setImageUrl("https://adidas.com/superstart.jpg");
		product2.setRating(4);
		product2.setRatingTotal(20);
		product2.setPriceNormal(Float.valueOf(1000));
		product2.setPricePromotion(Float.valueOf(500));
		product2.setDiscountPercent(Float.valueOf(50));
		product2.setStoreProvince(1);
		productRepository.save(product2);

		Product product3 = new Product();
		product3.setTitle("adidas pedator");
		product3.setProductCode("P003");
		product3.setImageUrl("https://adidas.com/pedator.jpg");
		product3.setRating(3);
		product3.setRatingTotal(15);
		product3.setPriceNormal(Float.valueOf(2000));
		product3.setPricePromotion(Float.valueOf(1800));
		product3.setDiscountPercent(Float.valueOf(10));
		product3.setStoreProvince(1);
		productRepository.save(product3);

		Product product4 = new Product();
		product4.setTitle("adidas yeezy");
		product4.setProductCode("P004");
		product4.setImageUrl("https://adidas.com/yeezy.jpg");
		product4.setRating(2);
		product4.setRatingTotal(35);
		product4.setPriceNormal(Float.valueOf(3000));
		product4.setPricePromotion(Float.valueOf(2400));
		product4.setDiscountPercent(Float.valueOf(20));
		product4.setStoreProvince(1);
		productRepository.save(product4);

		Product product5 = new Product();
		product5.setTitle("adidas boot");
		product5.setProductCode("P005");
		product5.setImageUrl("https://adidas.com/boot.jpg");
		product5.setRating(5);
		product5.setRatingTotal(40);
		product5.setPriceNormal(Float.valueOf(2500));
		product5.setPricePromotion(Float.valueOf(2000));
		product5.setDiscountPercent(Float.valueOf(2));
		product5.setStoreProvince(1);
		productRepository.save(product5);

		Product product6 = new Product();
		product6.setTitle("adidas NDM");
		product6.setProductCode("P006");
		product6.setImageUrl("https://adidas.com/ndm.jpg");
		product6.setRating(1);
		product6.setRatingTotal(1);
		product6.setPriceNormal(Float.valueOf(5000));
		product6.setPricePromotion(Float.valueOf(3000));
		product6.setDiscountPercent(Float.valueOf(40));
		product6.setStoreProvince(1);
		productRepository.save(product6);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
