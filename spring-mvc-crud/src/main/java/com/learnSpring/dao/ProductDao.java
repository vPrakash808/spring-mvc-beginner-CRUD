package com.learnSpring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learnSpring.model.Product;

@Repository
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	//get products
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get single product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}

	
	
	//update Product
	@Transactional
	public void updateProduct(Product product) {
		this.hibernateTemplate.update(product);
	}
	
}
