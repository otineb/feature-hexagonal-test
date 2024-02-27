package com.kairosDS.hexagonalarchitecture.application.service;

import com.kairosDS.hexagonalarchitecture.domain.Price;
/*
 * 
 * 
 * interfaz service de negocio para acceder al repository
 * 
 */
public interface IPriceService {
	   Price getPrice(final String applicationDate,final String idProduct,final String idChain);
}
