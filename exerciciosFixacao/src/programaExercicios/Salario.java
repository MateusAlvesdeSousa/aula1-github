package programaExercicios;

import java.util.Scanner;

import entidade.Empregado;

public class Salario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.print("Informe o Nome: ");
		 	empregado.name = teclado.nextLine();
		 System.out.print("Informe o valor do Sal�rio Bruto: R$ ");
		 	empregado.grossSalary = teclado.nextDouble();
		 System.out.print("Informe a Taxa sobre o Sal�rio: R$ ");
		 	empregado.tax = teclado.nextDouble();
		 	
		 System.out.println();
		 System.out.println("Empregado: " + empregado.name + ", R$ " + String.format("%.2f", empregado.netSalary()));
		 
		 System.out.println();
		 System.out.print("Qual a porcentagem de aumento do s�lario? ");
		  double percentage = teclado.nextDouble();
		  empregado.increaseSalary(percentage);
		 System.out.printf("Sal�rio Atualizado: " + empregado.name + ", R$ " + String.format("%.2f", empregado.netSalary()));
		  	 
		 teclado.close();
	}

}
