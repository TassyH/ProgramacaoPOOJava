
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Ave extends Animal {
    
    private double envergaduraAsas;
    
    public Ave(String nome, int idade, double peso, double envergaturaAsas) {
        super(nome, idade, peso);
        this.envergaduraAsas = envergaturaAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
    
     public void fazerSom(){
        System.out.println(" uiiii uiii (eu nao faço idea que som uma ave pode fazer)");
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
        System.out.println("Envergadura da Asa: " +getEnvergaduraAsas());
    }
    
    
    
    
}
