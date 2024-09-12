package BANK;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria(1212, 12222, "Teste", "1111111111111", -6);
		cb.imprimirInfor();
		cb.depositar(200);
		cb.sacar(10);
		cb.imprimirInfor();

	}

}
