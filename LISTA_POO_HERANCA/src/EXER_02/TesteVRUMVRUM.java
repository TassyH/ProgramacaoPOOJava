package EXER_02;

public class TesteVRUMVRUM {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo(22, 11, 32.55);
		v.obterInformacoesBasicas();
		
		System.out.println("-------------------");
		CarroPasseio cp = new CarroPasseio(12.1, 23, 31.55, "ferrari", "vermelho");
		cp.obterInformacoesBasicas();

	}

}
