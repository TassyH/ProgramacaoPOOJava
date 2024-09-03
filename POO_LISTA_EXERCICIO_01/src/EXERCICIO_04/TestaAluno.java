package EXERCICIO_04;

public class TestaAluno {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Maria Braga", "1111");
		a1.setNota01(7);
		a1.setNota02(8);
		a1.calculaMediaAritmetica();
		a1.situacaoAluno();
		
		Aluno a2 = new Aluno("Silvio Santos", "114241");
		a1.setNota01(6);
		a1.setNota02(7);
		a1.calculaMediaAritmetica();
		a1.situacaoAluno();
		
		Aluno a3 = new Aluno("Jo Soares", "1114411");
		a1.setNota01(2);
		a1.setNota02(5);
		a1.calculaMediaAritmetica();
		a1.situacaoAluno();
	}

}
