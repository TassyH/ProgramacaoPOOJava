package QUESTAO_01;

public class TestarConta {

	public static void main(String[] args) {
		Conta c = new Conta(1, "Vassoura?", 3, 12.50);
		double total = c.calcularContaTotal();
		double comDesconto = c.calcularComDesconto();
		c.imprimirInfor();
		
		System.out.println("Total a ser pago na compra: "+total);
		System.out.println("Total com desconto de 10%: "+comDesconto);
	
	}

}
