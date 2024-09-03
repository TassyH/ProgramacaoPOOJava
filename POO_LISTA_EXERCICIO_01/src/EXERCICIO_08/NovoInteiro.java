package EXERCICIO_08;

public class NovoInteiro {
	
	private int valor;
	
	
	public NovoInteiro(int valor) {
		if(valor >= 100 && valor <= 100) {
			this.valor = valor;
		}else {
			System.out.println("fora do intervalo valido");
			System.exit(0);
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}

//EU VOU DEIXAR ELE COM O COMERCIAL