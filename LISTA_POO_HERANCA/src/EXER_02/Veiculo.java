package EXER_02;


public class Veiculo {
	
	private double peso;
	private double velocMax;
	private double preco;
	
	public Veiculo() {
		
	}
	public Veiculo(double peso, double velocMax, double preco) {
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(double velocMax) {
		this.velocMax = velocMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void obterInformacoesBasicas() {
		System.out.println(this.peso);
		System.out.println(this.preco);
		System.out.println(this.velocMax);
	}

	

	
	

}
