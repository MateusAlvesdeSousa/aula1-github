import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = teclado.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
			System.out.printf("Os numeros %d e %d s�o multiplos", numero1, numero2);
		}
		else {
			System.out.printf("Os n�meros %d e %d n�o s�o multiplos", numero1, numero2);
		}
		
		teclado.close();
	}

}
