package programaExercicios;

import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println(("Informe as dimensões do Retângulo: "));
			retangulo.width = teclado.nextDouble();
			retangulo.height = teclado.nextDouble();
		
		System.out.printf("Area do retângulo é: %.2f%n", retangulo.area());
		System.out.printf("O perimetro do retângulo é: %.2f%n", retangulo.perimetro());
		System.out.printf("A diagonal do retângulo é: %.2f%n", retangulo.diagonal());
		
		teclado.close();

	}

}
