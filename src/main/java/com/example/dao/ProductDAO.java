package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface ProductDAO {
	public List<Product> getAllProduct();
	public Product createProduct(Product product);
	public Product getProductById(int productId);
	public void removeProduct(int productId);
}
