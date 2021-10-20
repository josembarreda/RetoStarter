package com.nttdata.bootcamp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("coche.marca")
public class CocheProperties {
	
	private String tipoCoche = "Audi";
	
	public String getTipo() {
		return tipoCoche;
	}
	
	public String setTipo(String tipoCoche) {
		return this.tipoCoche=tipoCoche;
	}

}
