package EXER_11;

import java.util.Scanner;

public class TestePoligonoRegular {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com O NUMERO DE LADOS");
		int lados = teclado.nextInt();
		
		System.out.println("Entre com a tamanho");
		double tamanho = teclado.nextDouble();

		PolRegular pr = new PolRegular(lados, tamanho);
		
		double calc  = pr.calcularPerimetro();
		System.out.println(calc);
		
	}

}
