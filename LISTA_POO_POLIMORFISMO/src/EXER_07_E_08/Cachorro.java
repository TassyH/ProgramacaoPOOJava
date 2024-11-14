package EXER_07_E_08;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("au au au");
		
	}

	@Override
	public void correr() {
		System.out.println("vrom vrom");
		
	}
	
	public void protegerCasa() {
		System.out.println("ninguem entra na minha quebrada");
	}

}
