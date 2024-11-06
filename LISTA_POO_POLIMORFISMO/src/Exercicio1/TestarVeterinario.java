package Exercicio1;

public class TestarVeterinario {

	public static void main(String[] args) {

		Veterinario vet = new Veterinario();
		Animal pas = new Passaro();
		Animal peixe = new Peixe();
		Animal sapo = new Sapo();
				
		vet.cuidar(pas);
		vet.cuidar(sapo);
		vet.cuidar(peixe);
	}

}
