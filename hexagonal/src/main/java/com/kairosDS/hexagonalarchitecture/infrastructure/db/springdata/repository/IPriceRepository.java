package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository;

import com.kairosDS.hexagonalarchitecture.domain.Price;

/*
 * 
 * interfaz repository para invocar a la capa de base de datos
 * 
 */
public interface IPriceRepository {
	  Price findByIdPrice(final String applicationDate, final String idProduct, final String idChain);
}
