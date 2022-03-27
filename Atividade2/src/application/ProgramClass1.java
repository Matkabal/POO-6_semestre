package application;

import entities.Classe1;

public class ProgramClass1 {

	public static void main(String[] args) {

		Classe1 class1 = new Classe1("Mateus", "Lima", 0, true);
		
		System.out.println(class1.getNome());
		System.out.println(class1.getSobrenome());
		System.out.println(class1.getNumero());
		System.out.println(class1.isAtivo());

	}

}
