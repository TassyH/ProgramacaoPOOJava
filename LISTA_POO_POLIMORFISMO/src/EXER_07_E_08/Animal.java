package EXER_07_E_08;

public abstract class Animal {
	private String nome;
    private int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void emitirSom ();
	public abstract void correr();
	public void imprimir() {
		System.out.println("nome: "+this.nome);
		System.out.println("idade: "+this.idade);
	}

	

}
