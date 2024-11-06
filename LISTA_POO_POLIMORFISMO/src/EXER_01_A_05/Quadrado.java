package EXER_01_A_05;

public class Quadrado extends FigurasGeometricas{

	public Quadrado(int numLado, double tamLado, double anguloInterno) {
		super(numLado, tamLado, anguloInterno);
	}

	@Override
	public double calcularArea() {
		return  getTamLado()*getTamLado();
	}

	@Override
	public double calcularPerimetro() {
		return getTamLado()*4;
	}



}
