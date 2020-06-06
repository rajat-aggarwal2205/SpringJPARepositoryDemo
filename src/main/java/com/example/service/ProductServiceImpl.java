package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDAO;
import com.example.model.Product;
@Service("productService")
public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO;
	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}
	@Override
	public List<Product> getAllProduct() {
		return productDAO.getAllProduct();
	}

	@Override
	public Product createProduct(Product product) {
		return productDAO.createProduct(product);
	}

	@Override
	public Product getProductById(int productId) {

		return productDAO.getProductById(productId);
	}
	@Override
	public void removeProduct(int productId) {
		productDAO.removeProduct(productId);
	}

}
