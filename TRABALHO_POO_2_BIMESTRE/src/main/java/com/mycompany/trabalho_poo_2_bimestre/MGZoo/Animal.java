/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso ) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void fazerSom(){
        System.out.println("fazer som");
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
    }
    
}
