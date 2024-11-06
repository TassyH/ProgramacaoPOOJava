package EXER_01;

public class Restaurante extends Empresa{
	
	private String comida;
	private double preco;

	
    public Restaurante() {
		
	}
	public Restaurante(String nome, String endereco, String cidade, String estado,  String cep, String telefone, int qtdeFunc, String comida, double preco) {
		super(nome, endereco, cidade, estado, cep, telefone, qtdeFunc);
		this.comida = comida;
		this.preco =preco;
	}
	
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println(this.comida);
		System.out.println(this.preco);
	}

	
}
