package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.023 * 1e23;
		int atomos = 4;
		double nraio = raio * 1e-7;
		double volume = Math.pow(Math.sqrt(8)*nraio,3) ;
		double densidade = (atomos*peso)/(avogadro*volume);
		return densidade;
		
	}
		

}