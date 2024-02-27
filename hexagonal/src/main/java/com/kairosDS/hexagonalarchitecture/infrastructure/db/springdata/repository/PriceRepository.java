package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.mapper.UserEntityMapper;

/*
 * 
 * clase repository para invocar a la capa de base de datos
 * 
 */

@Repository
public class PriceRepository implements IPriceRepository {
     @Autowired
	 private  PriceDataRepository priceDataRepository;
     @Autowired
     private  UserEntityMapper userMapper;
	 
	@Override
	public Price findByIdPrice(final String  applicationDate, final String idProduct, final String idChain) {
		
		return userMapper.toDomain(priceDataRepository.findByIdPrice(applicationDate, idProduct, idChain));
	}
}
