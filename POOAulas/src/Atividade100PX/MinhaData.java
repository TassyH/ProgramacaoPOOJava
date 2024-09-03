package Atividade100PX;

public class MinhaData {

	private int dia, mes, ano;
	
	public MinhaData() {
		
	}
	public MinhaData(int dia, int mes, int ano) {
		if(this.dia > 30 && this.dia <1) {
			this.dia = 1;
		}else {
			this.dia = dia;
		}
		if(this.mes > 12 && this.mes < 1) {
			this.mes = 1;
		}else {
			this.mes = mes;
		}
		if(this.ano < 2019) {
			this.ano = 2019;
		}else {
			this.ano = ano;
		}
	}
	
	public void avancarDia () {
		this.dia = this.dia + 1;
		
	}
	public int retrocederDia () {
		return this.dia = this.dia - 1;
	}
	public void  imprimirData () {
		System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
	}
	
	
}
