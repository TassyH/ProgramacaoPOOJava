package EXER_01_A_05;

public class TestaGeometria {

	public static void main(String[] args) {

		FigurasGeometricas triangulo = new Triangulo(3, 6.5, 4.9);
		triangulo.calcularArea();
		triangulo.calcularPerimetro();
		triangulo.getAnguloInterno();
		triangulo.imprimirInfor();
		
		System.out.println("------------------------------------------------------------------");
		
		FigurasGeometricas quadrado = new Quadrado(4, 9.8, 4);
		quadrado.calcularArea();
		quadrado.calcularPerimetro();
		quadrado.getAnguloInterno();
		quadrado.imprimirInfor();
		
	}

}
