package com.practice.code.springboot.caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Cacheable("products")
    public String getProductById(String productId){
        System.out.println("Fetching products from DB...");
        return "Product details for ID:" + productId;
    }
}
