package EXERCICIO_09;

public class TestaPontos {
	
	public static void main(String[] args) {
		Ponto2D p1 = new Ponto2D(5, 5);
		Ponto2D p2 = new Ponto2D(9, 8);
		
		DistanciaPonto d = new DistanciaPonto();
	    p1.setX(5);
		p1.setY(7);
		p2.setX(8);
		p2.setY(10);
		
	    double resultado;
	    
	   resultado =  d.calcularDistancia(p1, p2);
		System.out.println(resultado);

}
}
