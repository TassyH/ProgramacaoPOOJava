package EXER_01_A_05;

public abstract class FigurasGeometricas {
	
	private int numLado;
	private double tamLado;
	private double anguloInterno;
	
	public FigurasGeometricas(int numLado, double tamLado, double anguloInterno) {
		this.numLado = numLado;
		this.tamLado = tamLado;
		this.anguloInterno = anguloInterno; 
	}
	
	public int getNumLado() {
		return numLado;
	}

	public void setNumLado(int numLado) {
		this.numLado = numLado;
	}

	public double getTamLado() {
		return tamLado;
	}

	public void setTamLado(double tamLado) {
		this.tamLado = tamLado;
	}

	public double getAnguloInterno() {
		return anguloInterno;
	}

	public void setAnguloInterno(double anguloInterno) {
		if(anguloInterno > 0) {
			this.anguloInterno = anguloInterno;
		}else {
			System.out.println("angulo invalido");
		}

	}

	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
		
	public void imprimirInfor() {
		System.out.println("area: "+ calcularArea());
		System.out.println("perimetro: "+calcularPerimetro());
		System.out.println("angulo interno: "+getAnguloInterno());
	}
	

}
