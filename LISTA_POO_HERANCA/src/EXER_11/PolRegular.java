package EXER_11;

public class PolRegular {
	
	private int numLados;
	private double tamLado;

	public PolRegular(int numLados, double tamLado) {
		this.numLados = numLados;
		this.tamLado = tamLado;
	}
	
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public double getTamLado() {
		return tamLado;
	}
	public void setTamLado(double tamLado) {
		this.tamLado = tamLado;
	}
	
	public double  calcularPerimetro() {
		return this.numLados * this.tamLado;
	}

   

}
