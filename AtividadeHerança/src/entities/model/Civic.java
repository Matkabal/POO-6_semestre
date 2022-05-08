package entities.model;

import entities.enums.Brand;
import entities.general.Car;

public class Civic extends Car {

	public Civic(String plateNumber, Double price, int doorNumber, boolean isAirConditioning) {
		super(plateNumber, price, Brand.HONDA, doorNumber, isAirConditioning);
		// TODO Auto-generated constructor stub
	}
	
	

}
