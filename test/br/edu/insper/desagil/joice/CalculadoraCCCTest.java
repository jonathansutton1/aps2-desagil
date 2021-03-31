package br.edu.insper.desagil.joice;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import br.edu.insper.desagil.joice.model.Calculadora;


class CalculadoraCCCTest {
	private double tolerancia = 0.05;
	private Calculadora calculadora;

	@Test
	public void NiobioTest() {
		calculadora = new CalculadoraCCC();
		assertEquals(8.57, calculadora.densidade(92.91, 0.143), tolerancia);  //densidade esperada, densidade obtida
	}
	
	@Test
	public void TungstenioTest() {
		calculadora = new CalculadoraCCC();
		assertEquals(19.28,calculadora.densidade(183.84,0.137),tolerancia);
	}
	
	@Test
	public void LitioTest() {
		calculadora = new CalculadoraCCC();
		assertEquals(0.53, calculadora.densidade(6.94, 0.152),tolerancia);

}
