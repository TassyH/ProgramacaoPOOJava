package MINHA_DATA;

public class MinhaData {

	private int dia;
    private int mes;
    private int ano;
    
    public MinhaData() {
        this.dia=1;
        this.mes=1;
        this.ano=2019;
    }

    public MinhaData(int dia, int mes, int ano) {
        if(dia >=1 && dia <= 30 ) {
            this.dia = dia;
        }else {
            this.dia = 1;
        }
        if(mes >= 1 && mes  <= 12) {
            this.mes = mes;
        }else {
            this.mes = 1;
        }
        if(ano >= 2019) {
            this.ano = ano;
        }else {
            this.ano = 2019;
        }
    }
    
    public void avancarDia () {
        this.dia = this.dia + 1;
        if (this.dia > 30) {
            //vira o mes
        	this.dia = 1;
            this.mes++;
        }
        if(this.mes > 12) {
        	this.mes = 1;
        	this.ano++;
        }
    }
    public void retrocederDia () {
        this.dia = this.dia - 1;
        if(this.dia < 1) {
        	this.dia = 30;
        	this.mes--;
        }
    }
    public void  imprimirData () {
        System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
    }
	
}
