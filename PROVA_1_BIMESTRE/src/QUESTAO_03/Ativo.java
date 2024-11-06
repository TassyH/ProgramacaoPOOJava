package QUESTAO_03;

public class Ativo {
	
	private String tipo;
	private String ticket;
	private double preco;
	private int qtde;
	private double totalInvestido;
	
	public Ativo(String tipo, String ticket, double preco, int quantidade) {
		this.tipo = tipo;
		this.ticket = ticket;
		
		this.preco = preco;
		this.qtde = quantidade;
		
		if(this.preco > 1000) {
			System.out.println("astios caros demais certeza que vai comprar?");
		}
	}
	
	public double calcularTotal() {
		totalInvestido = this.preco * this.qtde;
		return totalInvestido;
	}
	
	public void printarInformacoesDosAtivos() {
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Ticket: "+this.ticket);
		System.out.println("Preco: "+this.preco);
		System.out.println("qantidade: "+this.qtde);
		System.out.println("----------------------------");

	}

}
