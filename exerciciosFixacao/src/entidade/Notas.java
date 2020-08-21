package entidade;

public class Notas {

	public double nota1;
	public double nota2;
	public double nota3;
	
	public void mediaSemestre(double media) {
		media = (nota1 + nota2 + nota3) / 3.0;
	}

}
