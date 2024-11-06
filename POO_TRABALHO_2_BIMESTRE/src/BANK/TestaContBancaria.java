package BANK;

public class TestaContBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria(1212, 12222, "Teste", "1111111", 0);
		cb.imprimirInfor();
		System.out.println("---------------------------------------");
		cb.depositar(200);
		cb.sacar(10);
		cb.imprimirInfor();

	}

}
