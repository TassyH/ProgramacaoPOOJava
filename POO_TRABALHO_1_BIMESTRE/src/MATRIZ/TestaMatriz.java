package MATRIZ;

public class TestaMatriz {

	public static void main(String[] args) {

		
		Matriz matriz  = new Matriz(3, 3, 10);
		matriz.preencher();
		System.out.println("------------");
		matriz.substituirPares(0);
	    matriz.imprimirInfor();	
	}

}
