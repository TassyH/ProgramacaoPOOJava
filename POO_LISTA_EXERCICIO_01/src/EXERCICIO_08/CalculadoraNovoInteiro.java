package EXERCICIO_08;

public class CalculadoraNovoInteiro {
	
	public int somar (NovoInteiro a, NovoInteiro b) {
	    int soma = a.getValor()+b.getValor();
		return soma;
	}
	
	public int subtrai (NovoInteiro a, NovoInteiro b) {
		int subtrai = a.getValor()-b.getValor();
		return subtrai;
	}
	
	public int multiplicacao (NovoInteiro a, NovoInteiro b) {
		int multiplicacao =a.getValor()*b.getValor();
		return multiplicacao;
	}
	
	public int divisao (NovoInteiro a, NovoInteiro b) {
		int multiplicacao = a.getValor()/b.getValor();
		return multiplicacao;
	}
	
	

}
