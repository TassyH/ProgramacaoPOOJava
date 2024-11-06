package EXER_13;

import EXER_11.PolRegular;
import EXER_12.TrianguloEquilatero;

public class Quadrado extends PolRegular{
	
	public Quadrado(int numLados, double tamLado) {
		super(numLados, tamLado);
	}

	public double areaQuadrado(double lado) {
		return lado*lado;
	}
	
	

}
