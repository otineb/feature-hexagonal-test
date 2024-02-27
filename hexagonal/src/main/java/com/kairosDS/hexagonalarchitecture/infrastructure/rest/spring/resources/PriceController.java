package com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.kairosDS.hexagonalarchitecture.application.service.PriceService;
import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.mapper.PriceMapper;

/**
 * controller para la peticiones
 * de price
 */
@RestController
public class PriceController implements IPriceController {

	  @Autowired	
	  private PriceService priceService;
	  @Autowired
	  private PriceMapper priceMapper;
	  
	@Override
	public ResponseEntity<Price> getProductByParameter(final String applicationDate, final String idProduct,final String idChain) {
		  return new ResponseEntity<>(priceService.getPrice(applicationDate, idProduct, idChain) , HttpStatus.OK);
	}
}
