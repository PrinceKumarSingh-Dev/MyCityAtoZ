package com.mycityaz.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycityaz.entity.Products;
import com.mycityaz.exception.NoSuchIdFound;
import com.mycityaz.repository.ProductsRepository;
import com.mycityaz.request.ProductsRequest;
import com.mycityaz.response.ProductsResponse;
import com.mycityaz.service.ProductsService;

@Service
public class ProductServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductsResponse addProduct(ProductsRequest productsRequest) {

		Products products = new Products();

		products = modelMapper.map(productsRequest, Products.class);

		products.setCreatedOnDate(new Date());
		products.setUpdatedOnDate(new Date());
		this.productsRepository.save(products);

		return this.modelMapper.map(products, ProductsResponse.class);

	}

	@Override
	public ProductsResponse getProductById(int productId) {

		Products products = this.productsRepository.findById(productId).orElseThrow(

				() -> new NoSuchIdFound("No Such ID Found"));

		return this.modelMapper.map(products, ProductsResponse.class);

	}

	@Override
	public List<ProductsResponse> getAllProduct() {
		List<Products> productList = this.productsRepository.findAll();

		List<ProductsResponse> ResponseList = productList.stream()
				.map(product -> this.modelMapper.map(product, ProductsResponse.class)).collect(Collectors.toList());

		return ResponseList;
	}

	@Override
	public void deleteProductById(int productId) {
		this.productsRepository.findById(productId).orElseThrow(() -> new NoSuchIdFound("No Such ID Found"));
		this.productsRepository.deleteById(productId);

	}

}
