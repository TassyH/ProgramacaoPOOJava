package EXER_07_E_08;

public class Zoologico {
	
	public static void main(String[] args) {
		
		 Animal [] jaulas = new Animal [6];
		 
		 jaulas[0] = new Cachorro("Cachorrito", 5);
		 jaulas[1] = new Cachorro("Papito", 5);
		 jaulas[2] = new Unicornio("Uniornia da barbie", 5);
		 jaulas[3] = new Unicornio("Marta", 5);
		 jaulas[4] = new Panda("Po", 5);
		 jaulas[5] = new Panda("Kung fuu", 5);
		 
		for(int i = 0; i < jaulas.length; i++) {
			Animal temp = jaulas[i];
			temp.imprimir();
			temp.correr();
			temp.emitirSom();
			
			if(temp instanceof Cachorro) {
				Cachorro c = (Cachorro) temp;
				c.protegerCasa();
			}
			if(temp instanceof Panda) {
				Panda p = (Panda) temp;
				p.dormirInfinitamente();
			}
			if(temp instanceof Unicornio) {
				Unicornio uni = (Unicornio) temp;
				uni.galopar();
			}
			
			System.out.println("********");
		}
	    

	}
	
	

}
