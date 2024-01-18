package JUnit;

public class Calculadora {
	
	private int num1,num2;

	public Calculadora(int operando1, int operando2) {
		// TODO Auto-generated constructor stub
		
		this.num1 = operando1;
		this.num2 = operando2;
	}
	
	public int sumar() {
		return this.num1 + this.num2;
	}
	
	public int restar() {
		return this.num1 - this.num2;
	}
	
	public int multiplicar() {
		return this.num1 * this.num2;
	}
	
	public int dividir() {
		return this.num1 / this.num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
