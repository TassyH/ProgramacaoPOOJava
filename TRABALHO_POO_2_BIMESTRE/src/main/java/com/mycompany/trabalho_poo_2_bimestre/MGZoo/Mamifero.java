
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Mamifero extends Animal{
    private double velocidade;

    public Mamifero(String nome, int idade, double peso, double velocidade) {
        super(nome, idade, peso);
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("UUHHAAAA (era pra ser um rugido de urso)");
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
        System.out.println("Velocidade: "+getVelocidade());

    }
    
    
    
    
}
