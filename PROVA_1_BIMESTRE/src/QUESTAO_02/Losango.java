package QUESTAO_02;

public class Losango {
	
	private double dimensaoMaior;
	private double dimensaoMenor;
	private double area;
	private double perimetro;
	private double lado;

	
	public Losango() {
		
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getDimensaoMaior() {
		return dimensaoMaior;
	}
	public void setDimensaoMaior(double dimensaoMaior) {
		this.dimensaoMaior = dimensaoMaior;
	}
	public double getDimensaoMenor() {
		return dimensaoMenor;
	}
	public void setDimensaoMenor(double dimensaoMenor) {
		this.dimensaoMenor = dimensaoMenor;
	}
	
	public void calcularArea() {
		this.area = (getDimensaoMaior()*getDimensaoMenor())/2;
	}
	
	public void calcularPerimetro() {
		this.perimetro = getLado()+getLado()+getLado()+getLado();
	}
	
	public double retornaValorArea() {
		return this.area;
	}
	public double retornaValorPerimetro() {
		return this.perimetro;
	}
	
	
	
	

}
