import java.util.Scanner;

public class testesProcessamento {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		
		nome = teclado.next();
		
		System.out.println("Voc� digitou: " + nome);
		
		teclado.close();
	}

}