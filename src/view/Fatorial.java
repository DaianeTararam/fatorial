package view;

import controller.FatorialController;

public class  Fatorial{
	public static void main(String[] args) {
		FatorialController imp = new FatorialController();
		System.out.println("Resultado: " +imp.calcular( 6 ));
	}
}