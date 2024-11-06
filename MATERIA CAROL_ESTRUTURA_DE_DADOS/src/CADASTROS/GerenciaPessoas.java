package CADASTROS;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaPessoas extends Pessoa {
	
	private ArrayList<Pessoa> pessoas;
	private int id;
	
	public GerenciaPessoas() {
		id = 1;
		pessoas = new ArrayList<Pessoa>();
	}	
	public void cadastra(Pessoa pessoa) {
		pessoa.setId(id);
		id++;
		pessoas.add(pessoa);
	}
	public void listarInformacao() {
		for(Pessoa pessoaAtual: pessoas) {
			System.out.println("ID: "+pessoaAtual.getId());
			System.out.println("NOME: "+pessoaAtual.getNome());
			System.out.println("CPF: "+pessoaAtual.getCpf());
			System.out.println("IDADE: "+pessoaAtual.getIdade());
			System.out.println("SEXO: "+pessoaAtual.getSexo());
			System.out.println("...........................");

		}

	}
	
	public void pesquisaPessoa(Scanner teclado, GerenciaPessoas gerenciador) {
		System.out.println("Entre com o nome da pessoa que deseja procurar");
		String nomeSearch = teclado.next();
		
		for(Pessoa pessoaAtual: pessoas) {
			if(pessoaAtual.getNome().equals(nomeSearch)) {
				System.out.println("ID: "+pessoaAtual.getId());
				System.out.println("NOME: "+pessoaAtual.getNome());
				System.out.println("CPF: "+pessoaAtual.getCpf());
				System.out.println("IDADE: "+pessoaAtual.getIdade());
				System.out.println("SEXO: "+pessoaAtual.getSexo());
				System.out.println("...........................");
			}
		}
		
	}

}
