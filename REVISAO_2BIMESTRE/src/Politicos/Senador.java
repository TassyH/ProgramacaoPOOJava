package Politicos;

public class Senador extends Politico{
	
	
	private int quantidadeAnos;

	public Senador(String nome, String partido, String estado, int numero, int quantidadeAnos) {
		super(nome, partido, estado, numero);
		// TODO Auto-generated constructor stub
		this.quantidadeAnos = quantidadeAnos;
	}
	
	public int getQuantidadeAnos() {
		return quantidadeAnos;
	}

	public void setQuantidadeAnos(int quantidadeAnos) {
		this.quantidadeAnos = quantidadeAnos;
	}


	@Override
	public void lelistar() {
		System.out.println("propondo um projeto de lei para melhorar o estado a "+quantidadeAnos);
		
	}

	@Override
	public void participarSessao() {
		System.out.println(getNome() +" esta participando de uma sessao a nivel federal");

		
	}

}
