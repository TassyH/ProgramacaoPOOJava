package EXER_07_E_08;

public class Unicornio  extends Animal{

	public Unicornio(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("ihiiiriririri");
		
	}

	@Override
	public void correr() {
		System.out.println("pocoto pocoto pocoto a eguinha pocoto");
		
	}
	
	public void galopar() {
		System.out.println("roiii");
	}

}
