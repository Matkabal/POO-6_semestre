package entities.strategy;

import entities.general.Car;
import entities.model.Client;
import entities.model.Wallet;

public non-sealed class Buy implements Operations {

	@Override
	public void transaction(Client client, Car car) {
		if(client.getWallet().enoughMoney(car.getPrice())) {
			client.getWallet().removeMoney(car.getPrice());
			client.addCar(car);
		}
		else {
			System.out.println("Money ins't enough, please, choose other car");
		}
		
		
	}

	

	

}
