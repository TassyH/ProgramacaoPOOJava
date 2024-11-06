package EXER_03;

public class Pacote {
	
	private String endereco;
	private String bairro;
	private String cep;
	private double peso;
	private double precoKg;
	
	public Pacote(String endereco,String bairro, String cep, double peso, double precoKg) {
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		if(peso > 0) {
			this.peso = peso;
		}else {
			System.out.println("peso invalido");
		}
		if(precoKg > 0) {
			this.precoKg = precoKg;
		}else {
			System.out.println("preco invalido");
		}
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}
	
	public double calcularCurto() {
		double calc = this.peso * this.precoKg;
		return calc;
	}
	
	public void obterInformacoesBasicas() {
		System.out.println(this.endereco);
		System.out.println(this.bairro);
		System.out.println(this.cep);
		System.out.println(this.peso);
		System.out.println(this.precoKg);

	}

	

}
