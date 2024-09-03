package EXERCICIO_02;

public class Lampada {
	
	
	private boolean statusLampada;
	
	public Lampada() {
		
	}
	
	public boolean apagar() {
		return statusLampada = false;
	}
	
	public  boolean acender() {
		return statusLampada = true;
	}
	
	public void mostrarStatus() {
		if(statusLampada) {
			System.out.println("a lampada está acessa");
		}else {
			System.out.println("a lampada está apagada");

		}
	}
	

}
