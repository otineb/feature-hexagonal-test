package com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
/*
 * clase para configurar y leer los paquetes
 * repository
 */
@Configuration
@EnableJpaRepositories(
    basePackages = "com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.repository")
@ConfigurationProperties("spring.datasource")
@Slf4j
@NoArgsConstructor
@Getter
@Setter
@EnableJpaAuditing
@EntityScan(basePackages = "com.kairosDS.hexagonalarchitecture.infrastructure.db.springdata.dbo")
public class DataConfig {
}
