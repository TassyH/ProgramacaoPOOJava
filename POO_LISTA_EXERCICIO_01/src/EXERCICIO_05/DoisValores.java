package EXERCICIO_05;

public class DoisValores {

	private int n1;
	private int n2;
	
	public DoisValores(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void maiorNumero() {
		if(n1 > n2) {
			System.out.println("O N1 é o maior");
		}else {
			System.out.println("O N2 é o maior");
		}
	}
	
	
}
