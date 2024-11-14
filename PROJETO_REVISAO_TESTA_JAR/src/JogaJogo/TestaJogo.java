package JogaJogo;

import jogos.Jogo;

public class TestaJogo {

	public static void main(String[] args) {
		Jogo j1 = new Jogo("God Of Wars", "PC", 2002);
		
		System.out.println(j1.iniciar());
		System.out.println(j1.contarPontos());
		j1.emitirSom();

	}

}
