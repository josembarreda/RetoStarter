package com.nttdata.bootcamp.Coche;

public class Coche {
	
	private String marca;
	private String color;
	private String modelo;
	
	public Coche (String marca, String color, String modelo) {
		
		this.marca =marca;
		this.color=color;
		this.modelo=modelo;	
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
