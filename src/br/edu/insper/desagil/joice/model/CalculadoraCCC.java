package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	public CalculadoraCCC() {
		super("CCC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.023*1e23;
		int atomos = 2;
		double nraio = raio * 1e-7;
		double volume = Math.pow((4*nraio)/(Math.sqrt(3)),3) ;
		double densidade = (atomos*peso)/(avogadro*volume);
		return densidade;
				
	}
	

}
