package entities.strategy;

import entities.general.Car;
import entities.model.Client;
import entities.model.Wallet;

public sealed interface Operations permits Buy, Sell{

	void transaction(Client client, Car car);
}
