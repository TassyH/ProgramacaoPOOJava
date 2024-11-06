package EXER_15_16_17_18;

public class Mamifero extends Animal{

	private String alimento;

	public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
		// TODO Auto-generated constructor stub
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public void imprimirInformacoes() {
		super.imprimirInformacoes();
		System.out.println("ALIMENTO: "+this.alimento);

	}

}
