package EXERCICIO_07;

public class Empregado {
	
	private String primeiroNome;
	private String segundoNome;
	private double salarioMensal;
	private double aumento;
	
	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	
	
	public Empregado(String primeiroNome, String segundoNome ) {
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		
		if(salarioMensal <= 0) {
			this.salarioMensal = 1800;
		}
	}
	
	public double calculaAumento(double aumento) {
		double aumentoTransformado = aumento /100;
		double calculaPorcentagem = aumentoTransformado * this.salarioMensal;
		double novoSalario = calculaPorcentagem + this.salarioMensal;
		return novoSalario;
	}
	
	public void imprimeInformacoes () {
		System.out.println(this.primeiroNome);
		System.out.println(this.segundoNome);
		System.out.println(calculaAumento(salarioMensal));
	}
	
	

}
