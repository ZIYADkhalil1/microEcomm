package com.zzo.ecomm.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzo.ecomm.entities.Products;
import com.zzo.ecomm.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private final ProductService productService;
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/addProduct")
	public String addProd(@RequestBody Products product) {
		
		try {
			productService.addProduct(product);
			return "Product Added Succesfully";
		}catch (Exception e) {
			return "Product not saved due to issue: " + e.getMessage();
		}
		
	}
}
