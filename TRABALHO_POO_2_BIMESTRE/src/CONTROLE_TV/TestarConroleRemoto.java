package CONTROLE_TV;

public class TestarConroleRemoto {

	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto("LG", 12, 10);
		
		cr.imprimirInfo();
	
		cr.aumentarVolume();
		cr.aumentarVolume();
		cr.imprimirInfo();
		
		cr.diminuirVolume();
		cr.imprimirInfo();
        cr.trocarCanal(16);
        cr.imprimirInfo();
	}

}
