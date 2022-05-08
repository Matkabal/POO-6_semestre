package entities.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.general.Car;

public class Client {

	private String name;
	private Wallet wallet;
	private String id;
	private List<Car> cars = new ArrayList<>();
	private Random aleatory = new Random();
	
	public Client(String name, Double initialValue, String id) {

		this.name = name;
		this.wallet = new Wallet(initialValue, name.concat("_").concat(String.valueOf(aleatory.nextInt(999999999))));
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public String getId() {
		return id;
	}
	public List<Car> getCars() {
		return cars;
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void removeCar(Car car) {
		cars.remove(car);
	}
	public boolean existsCar(Car car) {
		for(Car x: cars) {
			if(x.getId().equals(car.getId())) {
				return true;
			}
		}
		return false;
	}
	
}
