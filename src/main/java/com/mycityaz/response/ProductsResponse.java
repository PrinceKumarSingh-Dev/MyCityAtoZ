package com.mycityaz.response;

import java.util.Date;

import lombok.Data;

@Data
public class ProductsResponse {
	int productId;
	String productName;
	int productSkuNumber;
	float productSellingPrince;
	float productMRP;
	float productPurchasePrice;
	Date createdOnDate;
	Date updatedOnDate;
	Date expiryDate;
	int productStock;

}
