package EXERCICIO_08;

public class TestaInteiro {

	public static void main(String[] args) {

		NovoInteiro ni = new NovoInteiro(1000);
		NovoInteiro n2 = new NovoInteiro(900);
		CalculadoraNovoInteiro c = new CalculadoraNovoInteiro();
		
		//c.somar(ni, n2);
		System.out.println(c.somar(ni, n2));
		
		
		
	}

}
