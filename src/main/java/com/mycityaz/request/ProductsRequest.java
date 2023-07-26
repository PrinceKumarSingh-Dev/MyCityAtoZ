package com.mycityaz.request;

import java.util.Date;

import lombok.Data;

@Data
public class ProductsRequest {

	String productName;
	int productSkuNumber;
	float productSellingPrince;
	float productMRP;
	float productPurchasePrice;
	Date expiryDate;
	int productStock;
}
