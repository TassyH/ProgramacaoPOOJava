package EXER_02;

public class CarroPasseio extends Veiculo{
	
	private String marca;
	private String cor;
	
    public CarroPasseio() {
		
	}
    public CarroPasseio(double peso, double velocMax, double preco, String marca, String cor) {
		super(peso,preco, velocMax);
		this.marca = marca;
		this.cor = cor;
	}
    
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println(this.marca);
		System.out.println(this.cor);
	}
	
	
	


}
