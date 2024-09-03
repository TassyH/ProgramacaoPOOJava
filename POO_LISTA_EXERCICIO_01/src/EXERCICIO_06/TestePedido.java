package EXERCICIO_06;

public class TestePedido {

	public static void main(String[] args) {

		Pedido p1 = new Pedido(1, "pedido 1", 3, 12.5);
		p1.calcTotalFatura();
		p1.imprimeNotaPedido();
	}

}
