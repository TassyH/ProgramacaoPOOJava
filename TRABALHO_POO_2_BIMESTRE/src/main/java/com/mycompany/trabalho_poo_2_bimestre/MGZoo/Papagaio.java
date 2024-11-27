
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Papagaio extends Ave{
    
    public Papagaio(String nome, int idade, double peso, double envergaturaAsas) {
        super(nome, idade, peso, envergaturaAsas);
    }
    
    public void voar(){
        System.out.println("voar voar, subir subir, ir por onde foooorr");
    }
    
}
