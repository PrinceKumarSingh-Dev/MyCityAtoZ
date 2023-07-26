package com.mycityaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycityaz.request.ProductsRequest;
import com.mycityaz.response.ProductsResponse;
import com.mycityaz.service.ProductsService;

@RestController
@RequestMapping("api/mycityatoz")
public class ProductsController {
	@Autowired
	private ProductsService productsService;

	@PostMapping("/addproduct")
	public ResponseEntity<ProductsResponse> addProduct(@RequestBody ProductsRequest productsRequest) {
		return new ResponseEntity<ProductsResponse>(productsService.addProduct(productsRequest), HttpStatus.OK);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<ProductsResponse> getProductById(@PathVariable("id") int productId) {
		return new ResponseEntity<ProductsResponse>(this.productsService.getProductById(productId), HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<ProductsResponse>> getAllProduct() {
		return new ResponseEntity<List<ProductsResponse>>(this.productsService.getAllProduct(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable("id") int productId) {
		this.productsService.deleteProductById(productId);
		return new ResponseEntity<String>("Product Has Been Deleted", HttpStatus.OK);
	}
}
