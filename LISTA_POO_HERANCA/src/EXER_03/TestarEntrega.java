package EXER_03;

public class TestarEntrega {

	public static void main(String[] args) {

		Pacote p = new Pacote("endereço teste", "bairrot teste", "34234234", 60, 55 );
		p.obterInformacoesBasicas();
		System.out.println(p.calcularCurto());
		
		System.out.println(" ------------ super veloz--------------");
		SuperVeloz sp = new SuperVeloz("endereço super veloz", "bairrot super veloz", "830358800", 22, 32, 1, 5 );
		sp.obterInformacoesBasicas();
		System.out.println(sp.calcularCurto());
		
		
		
	}

}
