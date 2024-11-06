package Exercicio1;

public class Veterinario{

	
	/*public void cuidar(Sapo sapo) {
		sapo.mover();
		
	}
	
	public void cuidar(Passaro passarinho) {
		passarinho.mover();
	}
	
	public void cuidar(Peixe peixe) {
		peixe.mover();
	}*/
	
	public void cuidar(Animal animal) {
		animal.mover();
		
		if(animal instanceof Sapo) {
			Sapo sapo = (Sapo) animal;
			sapo.cacarMosca();
		}
	}

}
