package com.mycityaz.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Table
@Data
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	String productName;
	int productSkuNumber;
	float productSellingPrince;
	float productMRP;
	float productPurchasePrice;
	int productStock;

	@ColumnDefault(value = "1")
	boolean active = true;
	Date createdOnDate;
	Date updatedOnDate;
	Date expiryDate;

}
