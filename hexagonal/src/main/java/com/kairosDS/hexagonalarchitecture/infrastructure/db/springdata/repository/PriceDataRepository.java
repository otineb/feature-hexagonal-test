package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.dbo.PriceEntity;

/*
 * clase para ejecutar la consulta para la base H2
 * se ejecuta el select
 * 
 */
@Repository
public interface PriceDataRepository extends JpaRepository<PriceEntity, Long>{
	
	@Query(value = "SELECT  *"
			+ " FROM PRICE_ENTITY pe  WHERE pe.START_DATE=?1 and pe.PRODUCT_ID=?2 and pe.BRAND_ID=?3", nativeQuery = true)
	PriceEntity findByIdPrice(final String applicationDate,final String idProduct,final String idChain);
}
