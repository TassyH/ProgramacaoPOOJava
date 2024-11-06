package EXER_01;

public class Empresa {
	
	private String nome;
	private String endereco;
	private String estado;
	private String cidade;
	private String cep;
	private String telefone;
	private int qtdFunc;
	
	public Empresa() {
	}
	
	public Empresa(String nome, String endereco, String cidade, String estado,  String cep, String telefone, int qtdeFunc) {
		 this.nome = nome;
		 this.endereco = endereco;
		 this.cidade = cidade;
		 this.estado = estado;
		 this.cep = cep;
		 this.telefone = telefone;
		 this.qtdFunc = qtdeFunc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getQtdFunc() {
		return qtdFunc;
	}
	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}
	
	public void obterInformacoesBasicas() {
		System.out.println(this.nome);
		System.out.println(this.endereco);
		System.out.println(this.cep);
		System.out.println(this.estado);
		System.out.println(this.cidade);
		System.out.println(this.telefone);
		System.out.println(this.qtdFunc);



	}
	
	
	

}
