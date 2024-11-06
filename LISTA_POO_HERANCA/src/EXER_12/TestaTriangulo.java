package EXER_12;

import java.util.Scanner;

public class TestaTriangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a altura");
		double altura = teclado.nextDouble();
		
		System.out.println("Entre com a tamanho do lado");
		double tamBase = teclado.nextDouble();
		
		TrianguloEquilatero tri = new TrianguloEquilatero(0, tamBase);
		
		double area = tri.calcularArea(altura, tamBase);
		double per = tri.calcularPerimetro();

        System.out.println("AREA: "+area);
        System.out.println("PERIMETRO: "+per);


		
	}

}
