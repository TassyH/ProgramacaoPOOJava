package AVISAO_JAR_FRED;

import br.edu.fred.Aviao;

public class TestarAviao {
	
	public static void main(String[] args) {
		Aviao a = new Aviao (200, 300, false);
		
		a.decolar();
		a.atirar();
		a.pousar();
		a.decolar();
		a.atirar();
	}

}
