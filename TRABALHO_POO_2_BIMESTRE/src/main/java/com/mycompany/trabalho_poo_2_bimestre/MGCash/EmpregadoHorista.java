
package com.mycompany.trabalho_poo_2_bimestre.MGCash;

/**
 *
 * @author Tassy
 */
public class EmpregadoHorista extends Empregado{

    private int horasTrabalhadas;
    private double valorHora;
    
    public EmpregadoHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    

    @Override
    public double calcularSalario() {
        return horasTrabalhadas*valorHora;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println(".......... EMPREGADO HORIS ...........");        
        System.out.println("Nome: "+getNome());
        System.out.println("Salario: "+calcularSalario());
        System.out.println("Horas trabalhadas: "+getHorasTrabalhadas());
        System.out.println("valor da hra: "+getValorHora());
             
    }
    
}
