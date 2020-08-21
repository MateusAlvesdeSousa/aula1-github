import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		int soma = 0;
		
		for (int i = 0; i < numero; i ++ ) {
			int numero2 = teclado.nextInt();
			soma = soma + numero2;
			System.out.println(soma);	
		}
		
		teclado.close();
	}
}