package CONTROLE_TV;

public class ControleRemoto {
	
	private String marca;
	private int canalAtual;
	private int potenciaVolume;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getPotenciaVolume() {
		return potenciaVolume;
	}

	public void setPotenciaVolume(int potenciaVolume) {
		this.potenciaVolume = potenciaVolume;
	}

	
	
	public ControleRemoto(String marca, int canalAtual, int potenciaVolume){
		setMarca(marca);
		setCanalAtual(canalAtual);
		setPotenciaVolume(potenciaVolume);
	}
	
	public void aumentarVolume() {
		//this.potenciaVolume = potenciaVolume;
		if(potenciaVolume > 100) {
			System.out.println("O volume nao pode passar de 100");
		}else {
			this.potenciaVolume++;
			System.out.println("VOLUME +:"+this.potenciaVolume);
			System.err.println("++++++++++++++");

		}
	}
	public void diminuirVolume() {
		if(potenciaVolume < 0) {
			System.out.println("O volume nao pode ser menor que 0");
		}else {
			this.potenciaVolume--;
			System.out.println("VOLUME - :"+this.potenciaVolume);
			System.err.println("----------------");

		}
	}
	public String trocarCanal(int canal01) {
		if(canal01 >=1 && canal01 <=15) {
			setCanalAtual(canal01);
		}else {
			return "canal invalido";
		}
		return "";
	}
	
    public void imprimirInfo() {
    	System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    	System.out.println("marca: "+this.marca);
    	System.out.println("canal atual: "+this.canalAtual);
    	System.out.println("potencial do volume atual: "+this.potenciaVolume);
    	System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

    }
}
