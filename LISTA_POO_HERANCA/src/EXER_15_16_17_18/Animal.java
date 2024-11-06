package EXER_15_16_17_18;

public class Animal {

	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidadeMedia;
	
	public Animal(String nome, double comprimento, int numPatas, String cor,String ambiente, double velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public void imprimirInformacoes() {
		System.out.println("NOME: "+this.nome);
		System.out.println("COMPRIMENTO: "+this.comprimento);
		System.out.println("NUM PATAS: "+this.numPatas);
		System.out.println("COR: "+this.cor);
		System.out.println("VELOCIDADE: "+this.velocidadeMedia);

	}
	
	
}
