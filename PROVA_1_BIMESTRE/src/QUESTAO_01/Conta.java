package QUESTAO_01;

public class Conta {
	
	private int id;
	private String descricaoProduto;
	private int qtdeComprada;
	private double preco;
	private double total;
	
	
	public Conta(int id, String descricao, int quantidade, double preco) {
		this.id = id;
		this.descricaoProduto = descricao;
		if(quantidade >= 0) {
			this.qtdeComprada = quantidade;
		}else {
			System.out.println("quantidade nao pode ser negativa");
			System.exit(quantidade);
		}
		if(preco >= 0) {
			this.preco = preco;
		}else {
			System.out.println("preco nao pode ser negativa");
			System.exit(quantidade);
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public int getQtdeComprada() {
		return qtdeComprada;
	}
	public void setQtdeComprada(int qtdeComprada) {
		this.qtdeComprada = qtdeComprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calcularContaTotal() {
		this.total = getQtdeComprada()*getPreco();
		return this.total;
	}
	
	public double calcularComDesconto() {
		double valorDesconto = (0.1 * calcularContaTotal());
		return calcularContaTotal() - valorDesconto;
	
	}
	public void imprimirInfor() {
		System.out.println("----------- INFORMAÇÕES DA CONTA ------------");
		System.out.println("ID: "+this.id);
		System.out.println("Descrição: "+this.descricaoProduto);
		System.out.println("Quantidade Comprada: "+this.qtdeComprada);
		System.out.println("Preco: "+this.preco);

	}
	
	
	

}
