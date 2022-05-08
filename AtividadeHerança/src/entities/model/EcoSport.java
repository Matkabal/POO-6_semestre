package entities.model;

import entities.enums.Brand;
import entities.general.Car;

public class EcoSport extends Car{

	public EcoSport(String plateNumber, Double price, int doorNumber, boolean isAirConditioning) {
		super(plateNumber, price, Brand.FORD, doorNumber, isAirConditioning);
		// TODO Auto-generated constructor stub
	}

}
