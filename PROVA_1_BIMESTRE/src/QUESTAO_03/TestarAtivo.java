package QUESTAO_03;

public class TestarAtivo {

	public static void main(String[] args) {

		Ativo a = new Ativo("Acao", "BRSSS", 15000, 2);
		double valorTotal = a.calcularTotal();
		a.printarInformacoesDosAtivos();
		System.out.println(valorTotal);
	}

}
