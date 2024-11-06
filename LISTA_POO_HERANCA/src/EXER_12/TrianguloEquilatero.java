package EXER_12;

import EXER_11.PolRegular;

public class TrianguloEquilatero extends PolRegular{
	
	public TrianguloEquilatero(int numLados, double tamLado) {
		super(numLados, tamLado);

	}
	
	public double calcularArea(double altura, double tamanhoLado) {
		return (tamanhoLado * altura)/2;
	}
	
	

}
