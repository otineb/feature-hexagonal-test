package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kairosDS.hexagonalarchitecture.application.service.PriceService;
import com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository.PriceRepository;
/*
 * 
 * clase para configura el bean 
 */
@Configuration
public class SpringBootServiceConfig {


  @Bean
  public PriceService userService(PriceRepository userRepository) {
    return new PriceService(userRepository);
  }
}