package com.learnSpring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.learnSpring.dao.ProductDao;
import com.learnSpring.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	@GetMapping("/")
	public String display(Model model) {
		List<Product> products = productDao.getProducts();
		model.addAttribute("products",products);
		return "index";
	}
	
	@GetMapping("/addProduct")
	public String addProduct() {
		return "addProduct";
	}
	
	@PostMapping("/saveProduct")
	public String handleProduct(@ModelAttribute Product product ) {
		System.out.println(product);
		productDao.createProduct(product);
		return "redirect:/";
	}
	//delete product
	@GetMapping("/deleteProduct/{pid}")
	public String delete(@PathVariable("pid") int pid ){
		productDao.deleteProduct(pid);
		return "redirect:/";
	}
	//edit product
	@GetMapping("/editProduct/{pid}")
	public String editProduct(@PathVariable("pid") int pid, Model model) {
		Product product = productDao.getProduct(pid);
		model.addAttribute("product", product);
		return "edit";	
	}
	//update product
	@PostMapping("/editProduct/updateProduct")
	public String update(@ModelAttribute("product") Product product) {
		productDao.updateProduct(product);
		return "redirect:/";
	}
	

}
