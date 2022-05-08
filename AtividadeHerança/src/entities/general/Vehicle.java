package entities.general;

import java.util.Random;

import entities.enums.Brand;

public abstract class Vehicle {

	private String plateNumber;
	private Double price;
	private Brand brand;
	private String id;
	private Random aleatory = new Random();
	
	public Vehicle(String plateNumber, Double price, Brand brand) {
		super();
		this.plateNumber = plateNumber;
		this.price = price;
		this.brand = brand;
		this.id = String.valueOf(aleatory.nextInt());
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public Double getPrice() {
		return price;
	}
	public Brand getBrand() {
		return brand;
	}
	public String getId() {
		return id;
	}
	
}
