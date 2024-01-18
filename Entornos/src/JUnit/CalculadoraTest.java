package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSumar() {
		Calculadora c= new Calculadora(10,20);
		int resultado = c.sumar();
		if (resultado != 30) {
			fail("Resultado no válido");
		}
		}

	@Test
	public void testRestar() {
		Calculadora c= new Calculadora(20,10);
		int resultado = c.restar();
		assertEquals(10,resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora c= new Calculadora(2,10);
		int resultado = c.multiplicar();
		assertEquals(20,resultado);
	}

	@Test (expected = ArithmeticException.class)
	public void testDividir() {
		Calculadora c= new Calculadora(20,0);
		int resultado = c.dividir();
		assertEquals("Error",10,resultado);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
