package programaExercicios;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double nota1;
		double nota2;
		double media;
		double points;
		
		System.out.print("Informe o nome do Aluno: ");
		 	nome = teclado.nextLine();
		System.out.print("Informe a Nota 1: ");
		 	nota1 = teclado.nextDouble();
		System.out.print("Informe a Nota 2: ");
	 		nota2 = teclado.nextDouble();
	 		
	 	media = (nota1 + nota2) / 2;
	 	points = (100 - media);
	 	
	 	if (media >= 60) {
	 		System.out.printf("O Aluno " + nome + " est� Aprovado!");
	 	}
	 	else {
	 		System.out.println("O Aluno " + nome + " est� Reprovado!%n");
	 		System.out.println("Ele precisa de {} pontos para passar de ano." + points);
	 	}
	 	teclado.close();
	}
}
