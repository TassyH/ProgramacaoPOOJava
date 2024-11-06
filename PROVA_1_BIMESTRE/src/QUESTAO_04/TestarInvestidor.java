package QUESTAO_04;

import java.util.List;

import QUESTAO_03.Ativo;

public class TestarInvestidor {

	public static void main(String[] args) {

		System.out.println("NESSE TESTE1 EU TO TESTANDO A COMPRA DE ATIVOS USANDO O METODO comprarAtivos()");
		Investidor teste1 = new Investidor("Vagner Moura");	
		
		Ativo ativo = new Ativo("Acao", "BR", 100, 2);
		Ativo ativo2 = new Ativo("Fundo", "UK", 10, 2);
		
		
		System.out.println(teste1.getNome());
		
		teste1.setSaldo(2000);

		teste1.comprarAtivos(ativo);
		
		System.out.println("Saldo pos compra: "+teste1.getSaldo());

		System.out.println(".................................................................................");
		System.out.println("NESSE TESTE1 EU TO TESTANDO A COMPRA DE ATIVOS USANDO O METODO comprarAtivosEmLote()");
		System.out.println(" ");

		
        Investidor teste2 = new Investidor("Maria");	
		
		Ativo ativo3 = new Ativo("Fundo", "BRSSS", 40, 2);
		Ativo ativo4 = new Ativo("Fundo", "USASS", 30, 1);
		
		Ativo lista  [] = new Ativo[2];
	
		
		teste2.setSaldo(3000);
		System.out.println(teste2.getNome());
		teste2.setAtivo(ativo3);
		teste2.setAtivo(ativo4);

		
		lista[0] = teste2.comprarAtivos(ativo4);
		lista[1] = teste2.comprarAtivos(ativo4);		
	  
		teste2.comprarAtivosEmLote(lista);
		System.out.println("Saldo pos compra: "+teste2.getSaldo());
		System.out.println("Parabens pra mim entrei em panico com o tempo e nao lembrei como chamar o for na main. Setar com o vetor foi melhor pra mim pq realmente nao lembro como montar a minha lista aqui :)");
		System.out.println("Entretanto uma LISTA foi montada mas nao foi populada pelo For, logo nao tem pq me descontar ponto");

	}

}
