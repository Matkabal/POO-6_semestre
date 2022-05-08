package entities.general;

import java.util.Random;

import entities.enums.Brand;

public abstract class Car extends Vehicle {

	private int doorNumbers;
	private boolean isAirConditioning;
	

	
	public Car(String plateNumber, Double price, Brand brand, 
			int doorNumber, boolean isAirConditioning) {
		
		super(plateNumber, price, brand);
		this.doorNumbers = doorNumber;
		this.isAirConditioning = isAirConditioning; 
	}

	public int getDoorNumbers() {
		return doorNumbers;
	}

	public boolean isAirConditioning() {
		return isAirConditioning;
	}

	@Override
	public String toString() {
		return "Car [doorNumbers=" + doorNumbers + ", isAirConditioning=" + isAirConditioning + ", getPlateNumber()="
				+ getPlateNumber() + ", getPrice()=" + getPrice() + ", getBrand()=" + getBrand() + ", getId()="
				+ getId() + "]";
	}
	
	

}
