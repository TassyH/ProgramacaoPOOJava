package Politicos;

public class TestaPolitico {

	public static void main(String[] args) {

		Politico[]  politicos = new Politico [3];
		
		Vereador ver = new Vereador("vereador1", "PC", "Parana", 11111111);
		DeputadoEstadual dep = new DeputadoEstadual("Jose deputado", "AMD", "Bahia", 1211);
		Senador sen = new Senador("Maria Senador", "INTEL", "AMAPA", 111, 8);
		
		
		
		politicos[0] = ver;
		politicos[1] = dep;
		politicos[2] = sen;
		
		for(int i = 0; i<politicos.length; i++) {
			if(politicos[i] instanceof Senador) {
			Senador s = (Senador) politicos[i];
			System.out.println(s.getQuantidadeAnos());
			}
			politicos[i].info();

		}

		
	}

}
