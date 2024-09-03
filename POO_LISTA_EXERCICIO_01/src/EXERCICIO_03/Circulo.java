package EXERCICIO_03;

/*	Crie a classe Circulo que possui o atributo raio e um construtor para 
 * inicializar este raio. Se o raio for negativo, finalize a execução do 
 * programa e envie a mensagem “Raio negativo, impossível prosseguir”. 
 * Crie ainda dois métodos que irão calcular o perímetro do círculo (2*π*r) 
 * e sua área (π*r^2). Crie outra classe para testar a classe Circulo.*/

public class Circulo {
	
	private double raio;
	private double calcArea;
	private double calcPer;
	
	public Circulo(double raio){
		
		if(raio <0) {
			System.out.println("Raio negativo, impossível prosseguir");
			System.exit(0);
		}else {
		   this.raio = raio;
		}
	}
	
	public double calculaPerimetro() {
		return calcPer = raio*3.14*2;
	}
	public double calculaArea() {
		return calcArea = 3.14*(raio*raio);
	}
	
	public void mostrarCalculo() {
		double area = calculaArea();
		double perimetro = calculaPerimetro();
		
		System.out.println("a area do raio é:"+area);
		System.out.println("a area do raio é:"+perimetro);
		
	}

}
