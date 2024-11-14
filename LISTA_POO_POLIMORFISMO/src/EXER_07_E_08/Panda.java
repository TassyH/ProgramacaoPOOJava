package EXER_07_E_08;

public class Panda  extends Animal{

	public Panda(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("evebody like kong fuu fight");
		
	}

	@Override
	public void correr() {
		System.out.println("nao corre ne amore");
		
	}
	
	public void dormirInfinitamente() {
		System.out.println("dragao guerreiro");
	}

}
