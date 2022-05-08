package entities.strategy;

import entities.general.Car;
import entities.model.Client;
import entities.model.Wallet;

public non-sealed class Sell implements Operations{

	@Override
	public void transaction(Client client, Car car) {
		if(client.existsCar(car)){
			client.getWallet().addMoney(car.getPrice());
			client.removeCar(car);
		}
		else {
			System.out.println("O cliente não possui esse carro para vender");
		}
		
		
	}

	

	

}
