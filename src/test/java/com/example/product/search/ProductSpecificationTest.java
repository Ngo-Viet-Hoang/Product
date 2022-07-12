package com.example.product.search;

import com.example.product.ProductApplication;
import com.example.product.entity.Product;
import com.example.product.reponsitory.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplication.class)
class ProductSpecificationTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void demoTest() {
        ProductSpecification filter02 =
                new ProductSpecification(new SearchCriteria("name", "=", "Mr. Jarrod Von"));
        ProductSpecification filter01 =
                new ProductSpecification(new SearchCriteria("price", ">=", 10000 ));
        ProductSpecification filter03 =
                new ProductSpecification(new SearchCriteria("price", "<=", 15000 ));
        List<Product> orders = productRepository.findAll(filter01.and(filter03));
        System.out.println(orders.size());
    }
}