
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Cachorro extends Mamifero{
    
    public Cachorro(String nome, int idade, double peso, double velocidade) {
        super(nome, idade, peso, velocidade);
    }
    
    public void correr(){
        System.out.println("quem soltou os cachorros ufu ufu uf");
    }
    
}
