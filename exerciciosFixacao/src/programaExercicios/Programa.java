package programaExercicios;

import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println(("Informe as dimens�es do Ret�ngulo: "));
			retangulo.width = teclado.nextDouble();
			retangulo.height = teclado.nextDouble();
		
		System.out.printf("Area do ret�ngulo �: %.2f%n", retangulo.area());
		System.out.printf("O perimetro do ret�ngulo �: %.2f%n", retangulo.perimetro());
		System.out.printf("A diagonal do ret�ngulo �: %.2f%n", retangulo.diagonal());
		
		teclado.close();

	}

}
