package HERANCA.ANIMAIS;

public class Animal {

	private String nome;
	private double peso;
	private int idade;
	
	public Animal (String nome, double peso, int idade) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void comer(String alimento) {
		System.out.println(this.nome+ " comendo "+alimento);
	}
	public void obterInformacoesBasicas() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Peso: "+this.peso);
		System.out.println("Idade: "+this.idade);
	}
	

}
