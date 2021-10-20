package com.nttdata.bootcamp.Coche;

public class Coche {
	
	private String marca;
	
	public Coche (String marca) {
		
		this.marca =marca;
	}
	
	public String getElegir() {
		String tipoCoche="";
		switch(marca) {
		case "Audi" :
			tipoCoche = "Audi, Blanco , r8";
			break;
		
		case "BMW" :
			tipoCoche = "BMW, Gris, X6";
			break;
		
		case "Porsche" :
			tipoCoche = "Porsche, Negro, Cayman";
			break;
		
		default :
			tipoCoche = "Audi, Blanco , r8";
			break;
		}
		return tipoCoche;
	}

}
