package HERANCA.ANIMAIS;

public class Arara extends Animal {

	private int envergadura;
	
	public Arara(String nome, double peso, int idade, int invergadura) {
		super(nome, peso, idade);
		this.envergadura = envergadura;
		
	}
		
	public void brincar() {
		System.out.println(getNome()+" brincando de perseguir outros pássaros!!!");
	}
	
	@Override
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Envergadura: "+this.envergadura);
	}
	
}
