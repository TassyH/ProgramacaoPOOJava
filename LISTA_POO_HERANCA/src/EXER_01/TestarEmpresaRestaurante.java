package EXER_01;

public class TestarEmpresaRestaurante {

	public static void main(String[] args) {

		System.out.println("----------------------------EMPRESA---------------------------------------------");
		Empresa emp1 = new Empresa("Empresa Otica viver", "rua deus me ajuda", "PR", "Curitaiba", "434534543", "41333333", 22);
		emp1.obterInformacoesBasicas();
		
		//Restaurante res1 = new Restaurante();
		//res1.setNome("Quero comer");
		//System.out.println(res1.getNome());
		
		System.out.println("----------------------------RESTAURANTES---------------------------------------------");
		Restaurante res2 = new Restaurante("Don Enfirras", "rua deus me ajuda", "PR", "Curitaiba", "434534543", "41333333", 22, "esfirras", 6.99 );
		res2.obterInformacoesBasicas();
		
	}

}
