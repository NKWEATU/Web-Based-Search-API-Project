package net.javaguides.springboot_search_rest_api.service;

import net.javaguides.springboot_search_rest_api.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
