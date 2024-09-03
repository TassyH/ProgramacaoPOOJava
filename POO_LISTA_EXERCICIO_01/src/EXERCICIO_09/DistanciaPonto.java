package EXERCICIO_09;

public class DistanciaPonto {
	
	public double calcularDistancia (Ponto2D a, Ponto2D b) {
		double distancia;  // novoPonto.getX();
		//double xA, yA;
		distancia = (Math.pow(a.getX() - b.getX(),2) + Math.pow (a.getY()- b.getY(), 2));
		
		
		
		return Math.sqrt(distancia);
	}

}

//dAB² = (xB – xA)² + (yB – yA)²