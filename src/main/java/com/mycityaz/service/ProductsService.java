package com.mycityaz.service;

import java.util.List;

import com.mycityaz.request.ProductsRequest;
import com.mycityaz.response.ProductsResponse;

public interface ProductsService {

	ProductsResponse addProduct(ProductsRequest productsRequest);

	ProductsResponse getProductById(int productId);

	List<ProductsResponse> getAllProduct();

	void deleteProductById(int productId);

}
