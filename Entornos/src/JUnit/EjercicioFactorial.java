package JUnit;

import java.util.Scanner;

public class EjercicioFactorial {
	
	private static Scanner teclado = new Scanner(System.in);
	private static int numero = 1;
	private static double factorial = 1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ingresarNumero();
		comprobarNumero();

	}
	
	public static void ingresarNumero() {
		System.out.println("Introduzca un número: ");
		numero = teclado.nextInt();		
	}
	
	public static void comprobarNumero() {
		if (numero < 0) {
			throw new IllegalArgumentException("Numero " + numero + " no puede ser menor que 0" );
		}else {
			calcularFactorial();
		}
			
		}
	
	public static void calcularFactorial() {
		factorial = 1;
		
		 for (int i=numero;i>0;i--)
			 
		 {
			 factorial=factorial*i;
		 }
		 
		 System.out.println("Resultado: " + factorial);
		 
		 if(factorial == 0) {
			 throw new ArithmeticException("Número " + factorial + " demasiado grande");
		 }
		 
	}

}
