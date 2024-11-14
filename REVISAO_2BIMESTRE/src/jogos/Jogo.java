package jogos;

import java.util.Random;

public class Jogo {
	
	private String nome;
	private String plataforma;
	private int lancamento;
	
	
	public Jogo(String nome, String plataforma, int lancamento) {
		this.nome = nome;
		this.plataforma = plataforma;
		this.lancamento = lancamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getLancamento() {
		return lancamento;
	}
	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	
	public boolean iniciar() {
		
		int r = new Random().nextInt(10);
		if(r >=5) {
			return true;
		}else {
			return true;
		}
	}
	
	public void emitirSom() {
		System.out.println("piririri tanta tnantan");
	}
	
	public int contarPontos() {
		int r = new Random().nextInt(100);
		return r;
	}
	
	public boolean gameOver() {
		return false;
	}
	
	
	

}
