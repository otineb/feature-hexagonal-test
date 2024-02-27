package com.kairosDS.hexagonalarchitecture.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository.IPriceRepository;
import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository.PriceRepository;

/*
 * 
 * 
 * clase service de negocio para acceder al repository
 * y realizar las validaciones 
 */
@Service
public class PriceService implements IPriceService {

	@Autowired 
	private  IPriceRepository priceRepository;
	 
	public PriceService(PriceRepository userRepository) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Price getPrice(final String applicationDate,final String idProduct,final String idChain) {
		 return priceRepository.findByIdPrice(applicationDate,idProduct,idChain);	
	}

}
