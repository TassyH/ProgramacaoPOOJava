package EXER_01_A_05;

import java.util.Scanner;

public class TestarPoligonoRegular {

	public static void main(String[] args) {

		Engenheiro eng = new Engenheiro("Annabeth Chase");
		
		Scanner teclado = new Scanner(System.in);
		
	    boolean loop = true;
	   
		
		System.out.println("Entre com o numero de lados");
		int lados = teclado.nextInt();
		System.out.println("Entre com o tamanho do lado");
		double tam = teclado.nextDouble();
		System.out.println("Entre com o valor do angulo interno");
		double angulo = teclado.nextDouble();
		
		
		if(lados == 3) {
			System.out.println("TRIANGULO");
			FigurasGeometricas triangulo = new Triangulo(lados, tam, angulo);
			eng.calcular(triangulo);
			System.out.println("..........................");
		}else if(lados == 4) {
			System.out.println("QUADRADO");
			FigurasGeometricas quadrado = new Quadrado(lados, tam, angulo);
			eng.calcular(quadrado);
			System.out.println("..........................");
		}else if(lados == 5) {
			System.out.println("PENTAGONO");
			FigurasGeometricas pentagono = new Pentagono(lados, tam, angulo);
			eng.calcular(pentagono);
		}else {
			System.out.println("OPEAÇÃO INVALIDA");
		}
		
		

		
	}

}
