package EXERCICIO_04;

import java.util.concurrent.CopyOnWriteArrayList;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double media;
	public double nota01;
	private double nota02;
	private double calcMedia;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula; 
	}
	
	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}
	
	public double calculaMediaAritmetica() {
		calcMedia = (getNota01() + getNota02())/2;
		System.out.println("media eh: "+calcMedia);
		return calcMedia;
	}
	
	public void situacaoAluno() {
		if(calcMedia >= 7) {
			System.out.println("Aluno aprovado");
		}else if(calcMedia < 7 && calcMedia >= 4) {
			System.out.println("Aluno em recuperação");
		}else {
			System.out.println("Aluno reprovado");
		}
	}

	
	

}
