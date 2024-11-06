package EXER_15_16_17_18;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String caracteristica) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public void imprimirInformacoes() {
		super.imprimirInformacoes();
		System.out.println("CARACTERISTICAS: "+this.caracteristica);
	}
	
	

}
