package Politicos;

public class DeputadoEstadual extends Politico{
	

	private int quantidadeDeProjetos;

	public DeputadoEstadual(String nome, String partido, String estado, int numero) {
		super(nome, partido, estado, numero);
		setQuantidadeDeProjetos(quantidadeDeProjetos);
		// TODO Auto-generated constructor stub
	}
	
	public int getQuantidadeDeProjetos() {
		return quantidadeDeProjetos;
	}

	public void setQuantidadeDeProjetos(int quantidadeDeProjetos) {
		if(quantidadeDeProjetos < 0) {
			System.out.println("ERRO");
		}else {
			this.quantidadeDeProjetos = quantidadeDeProjetos;
		}
	}

	@Override
	public void lelistar() {
		System.out.println("propondo projetos de lei para o estado" +this.quantidadeDeProjetos+" projetos");
	}

	@Override
	public void participarSessao() {
		System.out.println("esta participando de uma sessao a nivel estadual");
		
	}

}
