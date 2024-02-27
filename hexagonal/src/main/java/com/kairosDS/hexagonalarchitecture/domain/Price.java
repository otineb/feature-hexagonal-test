package com.kairosDS.hexagonalarchitecture.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
/*
 * modelo de salida para la peticion
 */
@Setter
@Getter
public class Price implements Serializable {

 private static final long serialVersionUID = 7613380207039325244L;
 private int brandId; 
 private Timestamp startDate;     
 private Timestamp endDate ;
 private int priceList;  
 private String productId;  
 private double price;
 
public int getBrandId() {
	return brandId;
}
public Timestamp getStartDate() {
	return startDate;
}
public Timestamp getEndDate() {
	return endDate;
}
public int getPriceList() {
	return priceList;
}
public String getProductId() {
	return productId;
}
public double getPrice() {
	return price;
}
public void setBrandId(int brandId) {
	this.brandId = brandId;
}
public void setStartDate(Timestamp startDate) {
	this.startDate = startDate;
}
public void setEndDate(Timestamp endDate) {
	this.endDate = endDate;
}
public void setPriceList(int priceList) {
	this.priceList = priceList;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Price [brandId=" + brandId + ", startDate=" + startDate + ", endDate=" + endDate + ", priceList="
			+ priceList + ", productId=" + productId + ", price=" + price + "]";
}  
 
 
}
