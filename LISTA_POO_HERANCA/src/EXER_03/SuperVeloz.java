package EXER_03;

public class SuperVeloz extends Pacote {
	
	private int codRastreamento;
    private double taxa;
	
	public SuperVeloz (String endereco,String bairro, String cep, double peso, double precoKg, int codRastreamento, double taxa) {
		super(endereco, bairro, cep, peso, precoKg);
		this.codRastreamento = codRastreamento;
		this.taxa = taxa;
	}
	
	public int getCodRastreamento() {
		return codRastreamento;
	}

	public void setCodRastreamento(int codRastreamento) {
		this.codRastreamento = codRastreamento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularCurto() {
		double calc = super.calcularCurto();
		double calcTaxa = calc + this.taxa;
		return calcTaxa;
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println(this.codRastreamento);
		System.out.println(this.taxa);
	}

	
	
	

}
