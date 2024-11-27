/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_poo_2_bimestre.MGCash;

/**
 *
 * @author Tassy
 */
public abstract class Empregado {
    
   private String nome;
   private double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public abstract double calcularSalario();
   
    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Salario: "+calcularSalario());
    }
    
    
}
