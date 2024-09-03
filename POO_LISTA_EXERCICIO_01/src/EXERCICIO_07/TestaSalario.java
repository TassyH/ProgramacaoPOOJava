package EXERCICIO_07;

public class TestaSalario {

	public static void main(String[] args) {


		Empregado emp = new Empregado("nome", "spbrenome");
        emp.setSalarioMensal(500);
		double novoSalario;
		novoSalario = emp.calculaAumento(10);
		
		System.out.println(novoSalario);
	}

}
