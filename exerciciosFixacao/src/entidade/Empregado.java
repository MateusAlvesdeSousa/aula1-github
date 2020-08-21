package entidade;

public class Empregado {

	public String name;
	public double grossSalary;
	public double tax;
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + (grossSalary * percentage / 100);
	}
	public double netSalary() {
		return grossSalary - tax;
	}
}

