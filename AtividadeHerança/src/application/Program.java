package application;

import entities.general.Car;
import entities.model.Civic;
import entities.model.Client;
import entities.model.EcoSport;
import entities.strategy.Buy;
import entities.strategy.Operations;
import entities.strategy.Sell;

public class Program {

	public static void main(String[] args) {
		
		Car ecoSport = new EcoSport("12345678", 50000.00, 4, true);
		Car civic = new Civic("87654321", 60000.00, 4, true);
		Client Mateus =  new Client("Mateus", 200000.00, "123456");
		
	    Operations comprar = new Buy(); 
	    Operations vender = new Sell();
	    
	    
	    comprar.transaction(Mateus, civic);
	    comprar.transaction(Mateus, ecoSport);

	    
	    System.out.println(Mateus.getWallet());

	    for(Car x: Mateus.getCars()) {
	    	System.out.println(x.toString());
	    }
	    vender.transaction(Mateus, civic);
	    
	    System.out.println(Mateus.getWallet());

	    for(Car x: Mateus.getCars()) {
	    	System.out.println(x.toString());
	    }


		
	}

}
