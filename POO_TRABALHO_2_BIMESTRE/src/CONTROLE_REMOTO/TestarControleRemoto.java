package CONTROLE_REMOTO;

public class TestarControleRemoto {

	public static void main(String[] args) {
     ControleRemoto cr = new ControleRemoto("LG", 12, 99);
		
		cr.imprimirInfo();
		cr.aumentarVolume();
		cr.imprimirInfo();
		cr.aumentarVolume();
        cr.imprimirInfo();
		cr.diminuirVolume();
        cr.trocarCanal(12);
        cr.imprimirInfo();
		cr.diminuirVolume();
        cr.imprimirInfo();


	}

}
