package com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/*
 * 
 * modelo para la salida de la peticion
 */
public class PriceDto implements Serializable{
	
	private static final long serialVersionUID = -2723806546284351554L;
	 private int brandId; 
	 private Timestamp startDate;     
	 private Timestamp endDate ;
	 private int priceList;  
	 private String productId;  
	 private double price;  	 
}
