
public class Moto {
	
	 String fabricante;
	private double silindrada;
	 String fonteEnergia;
	private boolean ehBraba;
	private int qtdMarchas;
	
	public void estacionar() {
		System.out.println("está parada");
	}
	
	public void acelerar() {
		System.out.println("acelerador funciondo, moto correndo");
	}
	public void pusinar() {
		
	}
	
	public void mostrarInformacoes() {
		this.fabricante = "Toyota";
		this.fonteEnergia = "Energia Eletrica";
		this.silindrada = 122.00;
		
		this.ehBraba = true;
		System.out.println("fabricante: "+fabricante);
		System.out.println("Fonte de Energia: "+fonteEnergia);
		System.out.println("Silindrada: "+silindrada);
		System.out.println("Quantidade de Marchas: "+qtdMarchas);

		
	}

}
