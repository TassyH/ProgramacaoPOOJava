package HERANCA.ANIMAIS;

public class Leao extends Animal{

	private int forcaMandibula;
	
	public Leao(String nome, double peso, int idade, int forcaMandibula) {
		super(nome, peso, idade);
		this.forcaMandibula = forcaMandibula;
	}
	
	
	public void brincar() {
		System.out.println(getNome()+" brincando de bola");
		System.out.println("Cuidado, sua brincadeira pode machucar");
		setPeso(getPeso()-1);
	}
	
	@Override
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Forca da mandibula: "+this.forcaMandibula);
	}
	

}
