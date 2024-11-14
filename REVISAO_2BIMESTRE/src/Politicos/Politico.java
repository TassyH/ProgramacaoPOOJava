package Politicos;

public abstract class Politico {
	
	private String nome;
	private String partido;
	private String estado;
	private int numero;
	
	public Politico(String nome, String partido, String estado, int numero){
		this.nome = nome;
		this.partido = partido;
		this.estado = estado;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract void lelistar();
	public abstract void participarSessao();
	public void info() {
		lelistar();
		participarSessao();
	}

}
