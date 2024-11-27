/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class TestaZoo {
    
    public static void main(String[] args) {
        
        Mamifero urso = new Mamifero("kinai", 5, 60, 60);
        Ave tucano = new Ave ("Rfael (filme Rio)", 3, 80, 5);
        Reptil sapo = new Reptil("Sapinho", 1, 0.90, 10);
        
        Animal [] animais = new Animal[3];
        animais[0] = urso;
        animais[1] = tucano;
        animais [2] = sapo;
        
        for (Animal animal : animais){
            animal.fazerSom();
            animal.exibirInformacoes();
            System.out.println("-----------------");

        }
      
    }
    
}
