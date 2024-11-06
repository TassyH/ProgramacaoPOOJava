package EXER_01_A_05;

public class Pentagono extends FigurasGeometricas{

	public Pentagono(int numLado, double tamLado, double anguloInterno) {
		super(numLado, tamLado, anguloInterno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		return (5*Math.pow(getTamLado(), 2))/4*Math.tan(36);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return  getTamLado() * 5;
	}


}
