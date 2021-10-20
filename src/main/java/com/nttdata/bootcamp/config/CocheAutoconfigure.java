package com.nttdata.bootcamp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.config.CocheProperties;
import com.nttdata.bootcamp.Coche.Coche;

@Configuration
@ConditionalOnClass(Coche.class)
@EnableConfigurationProperties(CocheProperties.class)
public class CocheAutoconfigure {
	
	private final CocheProperties properties;
	
	public CocheAutoconfigure (CocheProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Coche coche() {
		return new Coche(properties.getTipo());
	}

}
