import java.util.Scanner;

import bomba.Bomba;

public class TestaBomba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bomba b1 = new Bomba();
		
		   

	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Entre com o numero de alunos da sua turma:");
	        int qtddAlunos = teclado.nextInt();
	        System.out.println("ENTRE COM O NUMERO DO SEU PERIODO");
	        System.out.println("1 - 1 PEROIODO");
	        System.out.println("2 - 2 PEROIODO");
	        System.out.println("3 - 3 PEROIODO");
	        System.out.println("4 - 4 PEROIODO");
	        System.out.println("5 - 5 PEROIODO");
	        int per = teclado.nextInt();

	        b1.setQuantidadeAlunos(qtddAlunos);
	        b1.setPeriodo(per);
	        b1.bombardearTurma();
	        b1.recadoInformativo();

	}

}
