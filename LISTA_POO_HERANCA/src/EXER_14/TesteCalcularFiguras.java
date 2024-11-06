package EXER_14;

import java.util.Scanner;

import EXER_12.TrianguloEquilatero;
import EXER_13.Quadrado;

public class TesteCalcularFiguras {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
		
        System.out.println("Entre com o numero dos lado");
		int numLado = teclado.nextInt();
		System.out.println("Entre com o tamanho do lado");
		double tamLado = teclado.nextDouble();
		
		if(numLado == 3) {
			TrianguloEquilatero tri = new TrianguloEquilatero(numLado,tamLado);
			double areaTri = tri.calcularArea(numLado, tamLado);
			double perTri = tri.calcularPerimetro();
			System.out.println("AREA TRIANGULO: "+areaTri);
			System.out.println("AREA RETANGULO: "+perTri);

		}else if(numLado == 4) {
			Quadrado quad = new Quadrado(numLado, tamLado);
			double areaQuad = quad.areaQuadrado(tamLado);
			System.out.println("AREA QUADRADO: "+areaQuad);
		}else {
			
		     System.out.println("figura desconhecida por esse pobre e burro programa");
			
		}
		
		
		
		
	}

}
