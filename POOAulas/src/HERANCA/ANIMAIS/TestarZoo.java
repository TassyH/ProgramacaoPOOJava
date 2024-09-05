package HERANCA.ANIMAIS;

public class TestarZoo {

	public static void main(String[] args) {

		Arara arara = new Arara("Blue", 5, 10, 3);
		Leao leao = new Leao("Iscar", 310, 10, 15);
		
		arara.obterInformacoesBasicas();
		leao.obterInformacoesBasicas();
		
	}

}
