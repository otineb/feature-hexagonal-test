package com.kairosDS.hexagonalarchitecture;


import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import com.kairosDS.hexagonalarchitecture.application.service.PriceService;
import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.resources.PriceController;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(MockitoExtension.class)
@Slf4j
class TestHexagonalArchitectureApplicationTests {
	 private static Logger logger = LoggerFactory.getLogger(TestHexagonalArchitectureApplicationTests.class);
	@InjectMocks
	private PriceController priceController;
	
	@Mock
 	private PriceService priceService;

	@Test
	void getProduct1Test() {
		when(priceService.getPrice("2020-06-14 00.00.00","35455","1")).thenReturn(getPrice1Res());
		ResponseEntity<Price> price = priceController.getProductByParameter("2020-06-14 00.00.00","35455","1");
		Assertions.assertNotNull(price);
	}

	@Test
	void getProduct2Test() {
		when(priceService.getPrice("2020-06-14 00.00.00","35455","1")).thenReturn(getPrice2Res());
		ResponseEntity<Price> price = priceController.getProductByParameter("2020-06-14 00.00.00","35455","1");
		Assertions.assertNotNull(price);
	}

	@Test
	void getProduct3Test() {
		when(priceService.getPrice("2020-06-14 00.00.00","35455","1")).thenReturn(getPrice3Res());
		ResponseEntity<Price> price = priceController.getProductByParameter("2020-06-14 00.00.00","35455","1");
		Assertions.assertNotNull(price);
	}
	
	@Test
	void getProduct4Test() {
		when(priceService.getPrice("2020-06-14 00.00.00","35455","1")).thenReturn(getPrice4Res());
		ResponseEntity<Price> price = priceController.getProductByParameter("2020-06-14 00.00.00","35455","1");
		Assertions.assertNotNull(price);
	}

	@Test
	void getProduct5Test() {
		when(priceService.getPrice("2020-06-14 00.00.00","35455","1")).thenReturn(getPrice5Res());
		ResponseEntity<Price> price = priceController.getProductByParameter("2020-06-14 00.00.00","35455","1");
		Assertions.assertNotNull(price);
	}
	
	Price getPrice1Res() {
		Price dto=new Price();
		dto.setBrandId(1);
		dto.setEndDate(Timestamp.valueOf(LocalDateTime.of(2024, 2, 14, 10, 0)));	
		dto.setPrice(0);
		dto.setPriceList(35455);
		dto.setProductId("2");
		dto.setStartDate(Timestamp.valueOf(LocalDateTime.now()));
		logger.info("peticion "+dto.getEndDate()+ " del producto "+ dto.getPriceList()+" para la brand (zara)" +" "+dto.getBrandId());
		return dto;				
	}
	
	Price getPrice2Res() {
		Price dto=new Price();
		dto.setBrandId(1);
		dto.setEndDate(Timestamp.valueOf(LocalDateTime.of(2024, 2, 14, 16, 0)));	
		dto.setPrice(0);
		dto.setPriceList(35455);
		dto.setProductId("3");
		dto.setStartDate(Timestamp.valueOf(LocalDateTime.now()));

		logger.info("peticion "+dto.getEndDate()+ " del producto "+ dto.getPriceList()+" para la brand (zara)" +" "+dto.getBrandId());
		return dto;				
	}
	
	Price getPrice3Res() {
		Price dto=new Price();
		dto.setBrandId(1);
		dto.setEndDate(Timestamp.valueOf(LocalDateTime.of(2024, 2, 14, 21, 0)));	
		dto.setPrice(0);
		dto.setPriceList(35455);
		dto.setProductId("4");
		dto.setStartDate(Timestamp.valueOf(LocalDateTime.now()));

		logger.info("peticion "+dto.getEndDate()+ " del producto "+ dto.getPriceList()+" para la brand (zara)" +" "+dto.getBrandId());
		return dto;				
	}
	
	Price getPrice4Res() {
		Price dto=new Price();
		dto.setBrandId(1);
		dto.setEndDate(Timestamp.valueOf(LocalDateTime.of(2024, 2, 15, 10, 0)));	
		dto.setPrice(0);
		dto.setPriceList(35455);
		dto.setProductId("5");
		dto.setStartDate(Timestamp.valueOf(LocalDateTime.now()));
		
		logger.info("peticion "+dto.getEndDate()+ " del producto "+ dto.getPriceList()+" para la brand (zara)" +" "+dto.getBrandId());
		return dto;				
	}
	
	Price getPrice5Res() {
		Price dto=new Price();
		dto.setBrandId(1);
		dto.setEndDate(Timestamp.valueOf(LocalDateTime.of(2024, 2, 16, 21, 0)));	
		dto.setPrice(0);
		dto.setPriceList(35455);
		dto.setProductId("1");
		dto.setStartDate(Timestamp.valueOf(LocalDateTime.now()));
		
		logger.info("peticion "+dto.getEndDate()+ " del producto "+ dto.getPriceList()+" para la brand (zara)" +" "+dto.getBrandId());
		return dto;				
	}
	
}
