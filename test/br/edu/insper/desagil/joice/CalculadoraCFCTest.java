package br.edu.insper.desagil.joice;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import br.edu.insper.desagil.joice.model.Calculadora;
import br.edu.insper.desagil.joice.model.CalculadoraCFC;

class CalculadoraCFCTest {
	private double tolerancia = 0.05;
	private Calculadora calculadora;

		
	@Test
	public void CobreTest() {
		calculadora = new CalculadoraCFC();
		assertEquals(8.89, calculadora.calcula(63.55, 0.128),tolerancia);
	}

	@Test
	public void OuroTest() {
		calculadora = new CalculadoraCFC();
		assertEquals(19.36, calculadora.calcula(196.97, 0.144),tolerancia);
	}

	@Test
	public void PrataTest() {
		calculadora = new CalculadoraCFC();
		assertEquals(10.60, calculadora.calcula(107.87, 0.144),tolerancia);
	}

}
