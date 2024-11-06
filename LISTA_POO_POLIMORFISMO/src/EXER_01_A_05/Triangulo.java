package EXER_01_A_05;

public class Triangulo extends FigurasGeometricas{

	public Triangulo(int numLado, double tamLado, double anguloInterno) {
		super(numLado, tamLado, anguloInterno);
	}

	@Override
	public double calcularArea() {
		return  ((getTamLado()*getTamLado()) * Math.sqrt(3))/4;
	}

	@Override
	public double calcularPerimetro() {
		return getTamLado() *3;
	}

}
