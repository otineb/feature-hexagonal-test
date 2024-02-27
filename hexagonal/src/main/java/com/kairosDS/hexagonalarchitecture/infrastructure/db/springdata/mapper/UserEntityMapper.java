package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;

import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.dbo.PriceEntity;
/*
 * 
 * clase mapper para 
 *  mapear nuestras Entidades 
 */
@Mapper(componentModel = "spring")
public interface UserEntityMapper {

  Price toDomain(PriceEntity userEntity);

  PriceEntity toDbo(Price user);


}
