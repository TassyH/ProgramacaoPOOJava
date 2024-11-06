package EXER_01_A_05;

public class Engenheiro {
	
	private String nome;


	public Engenheiro(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calcular(FigurasGeometricas figuras){
		 figuras.calcularArea();
		 figuras.calcularPerimetro();
		 figuras.getAnguloInterno();
		 figuras.imprimirInfor();
	}
	
	

}
