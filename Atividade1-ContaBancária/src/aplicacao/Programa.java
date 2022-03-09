package aplicacao;

import entidades.ContaBancaria;

public class Programa {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria("1", 50);
		ContaBancaria conta2 = new ContaBancaria("2", 20);
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		System.out.println();
		
		conta1.debitar(35);
		conta2.creditar(35);
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());



		
	}

}
