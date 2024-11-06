package EXER_13;

import java.time.Period;
import java.util.Scanner;

public class TesteQuadrado {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado");
		double tamLado = teclado.nextDouble();
		
		Quadrado quad = new Quadrado(0, tamLado);
		double area = quad.areaQuadrado(tamLado);
		double perimetro = quad.calcularPerimetro();
		
		System.out.println("AREA: "+area);
		System.out.println("PERIMETRO: "+perimetro);
	}

}
