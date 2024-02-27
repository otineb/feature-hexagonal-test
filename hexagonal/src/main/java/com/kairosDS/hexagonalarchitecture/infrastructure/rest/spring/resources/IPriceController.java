package com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kairosDS.hexagonalarchitecture.domain.Price;

/*
 * interfaz para el controller 
 * tipo de metodo y los paramatros de entrada
 * 
 */
public interface IPriceController {
 
	  @GetMapping("prices/price")
	  public ResponseEntity<Price> getProductByParameter( @RequestParam final String applicationDate,
			  @RequestParam final String idProduct, @RequestParam 
			 final String idChain  );
}
