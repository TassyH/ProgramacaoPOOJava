package EXERCICIO_06;

public class Pedido {

	private int codItem;
	private String descricao;
	private int quantidade;
	private double preco; 
	private double totalFatura;
	
	
	public Pedido(int codItem, String descricao, int quantidade, double preco) {
		this.codItem = codItem; 
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	public double calcTotalFatura(){
		return this.totalFatura = this.quantidade * this.preco;
	}
	
	public void imprimeNotaPedido() {
		System.out.println("código do pedido: "+this.codItem);
		System.out.println("Descrição: "+ this.descricao);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Fatura Total: "+this.totalFatura);
	}
	
	
}
