package QUESTAO_04;

import QUESTAO_03.Ativo;

public class Investidor {
	
	private String nome;
	private double saldo;
	private String tipoInvestimento;
	private Ativo ativo;
	

	
	public Investidor(String nome) {
		this.nome = nome;
	}
	
	public Ativo getAtivo() {
		return ativo;
	}


	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}
	
	public Ativo comprarAtivos(Ativo ativo) {
		ativo.printarInformacoesDosAtivos();
	    setSaldo(this.saldo - ativo.calcularTotal());
		return ativo;
	}
	
	public void comprarAtivosEmLote(Ativo [] ativos) {
		
		//for(int i = 0; i < ativos.length; i++) {
		//	ativos[i].printarInformacoesDosAtivos();
		//	setSaldo(this.saldo - ativos[i].calcularTotal());
		//}
		
		getAtivo().printarInformacoesDosAtivos();
		setSaldo(this.saldo - getAtivo().calcularTotal());
	}
	
	

}
