package Politicos;

public class Vereador extends Politico{
	
	private String municipio; 

	public Vereador(String nome, String partido, String estado, int numero) {
		super(nome, partido, estado, numero);
		this.municipio = municipio;
		// TODO Auto-generated constructor stub
	}
	

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	@Override
	public void lelistar() {
		System.out.println("Criando leis para melhorar a vida do cidadao do seu "+this.municipio);
		
	}

	@Override
	public void participarSessao() {
		System.out.println(getNome() + " está participando da sessão em nivel municipal");
		
	}

}
