package com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.kairosDS.hexagonalarchitecture.domain.Price;
import com.kairosDS.hexagonalarchitecture.infrastructure.rest.spring.dto.PriceDto;
/*
 * 
 * mapper para modelar el objeto de 
 * entrada con la salida
 * 
 */
@Mapper(componentModel = "spring")
public interface PriceMapper {

  PriceDto toDto (Price user);

  Price toDomain(PriceDto userDto);
}
