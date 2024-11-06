package EXER_15_16_17_18;

public class TestarAnimais {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero("Camelildo", 154.44, 4, "Marrom", "Regioes Polares", 10.55, "Plantas, coisas verdes");
		Peixe tubarao = new Peixe("Sharknado", 90, 0, "Branco", "Agua", 110.55, "Outros animais menores");
		Mamifero urso = new Mamifero("Irmao Urso", 80.44, 4, "Branco", "Regioes Polares", 45, "Carne");
		
		camelo.imprimirInformacoes();
		tubarao.imprimirInformacoes();
		urso.imprimirInformacoes();

	}

}
