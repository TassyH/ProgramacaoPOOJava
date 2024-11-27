
package com.mycompany.trabalho_poo_2_bimestre.MGCash;

/**
 *
 * @author Tassy
 */
public class EmpregadoAssalariado extends Empregado{
    
    public EmpregadoAssalariado(String nome, double salarioBase) {
     super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
    

    @Override
    public void exibirDetalhes(){
        System.out.println(".......... EMPREGADO ASSALARIADO ...........");

        System.out.println("Nome: "+getNome());
        System.out.println("Salario: "+calcularSalario());
    }    
    
}
