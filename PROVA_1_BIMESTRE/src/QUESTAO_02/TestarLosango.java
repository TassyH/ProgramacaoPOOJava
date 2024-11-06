package QUESTAO_02;

public class TestarLosango {

	public static void main(String[] args) {

		Losango log = new Losango();
		log.setDimensaoMaior(20);
		log.setDimensaoMenor(10);
		log.calcularArea();
		double valorRetornado = log.retornaValorArea();
		System.out.println("area do losango: "+valorRetornado);
		System.out.println("Outra forma de pegar a area direto pelo getArea: "+log.getArea());
		
		
		log.setLado(2);
		log.setLado(3);
		log.calcularPerimetro();
		System.out.println("Pegando o perimetro pelo getPerimetro: "+log.getPerimetro());
		double valorPerimetroRetornado = log.retornaValorPerimetro();
		System.out.println("Perimetro: "+valorPerimetroRetornado);
	}

}
