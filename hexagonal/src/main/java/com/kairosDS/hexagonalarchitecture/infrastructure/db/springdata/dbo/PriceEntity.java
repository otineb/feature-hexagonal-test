package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.dbo;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*
 * 
 * 
 * modelo para la entidad de la tabla
 * para la base h2
 * 
 */
@Entity
@Getter
@Setter
@Table(name="PRICE_ENTITY")
public class PriceEntity implements Serializable {

	private static final long serialVersionUID = 2590748579607661254L;
	@Id
	private int idPriceEntity;
	private int brandId; 
	private Timestamp startDate;     
	private Timestamp endDate ;
	private int priceList;  
	private String productId;  
	private String priority; 
	private double price;  
	private String curr;  
}
