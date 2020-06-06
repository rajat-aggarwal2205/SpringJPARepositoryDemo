package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product createProduct(Product product);
	public Product getProductById(int productId);
	public void removeProduct(int productId);
}
