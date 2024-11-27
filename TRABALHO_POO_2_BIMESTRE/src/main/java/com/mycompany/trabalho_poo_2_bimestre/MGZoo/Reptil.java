package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Reptil extends Animal {
    
    private double temperaturaCorporal;

    public Reptil(String nome, int idade, double peso, double temperaturaCorporal) {
        super(nome, idade, peso);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }
    
    public void fazerSom(){
        System.out.println("uga uga uga (som de sapo????");
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
        System.out.println("Temperatura comporal: "+getTemperaturaCorporal());
    }
    
    
    
    
    
}
