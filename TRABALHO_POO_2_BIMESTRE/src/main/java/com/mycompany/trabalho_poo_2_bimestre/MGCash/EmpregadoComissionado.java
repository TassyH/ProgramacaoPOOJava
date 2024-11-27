
package com.mycompany.trabalho_poo_2_bimestre.MGCash;

/**
 *
 * @author Tassy
 */
public class EmpregadoComissionado extends Empregado{
    
    private double valorTotalDasVendas;
    private double percentualComissao;

    public EmpregadoComissionado(String nome, double salarioBase, double valorTotalDasVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.valorTotalDasVendas = valorTotalDasVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorTotalDasVendas() {
        return valorTotalDasVendas;
    }

    public void setValorTotalDasVendas(double valorTotalDasVendas) {
        this.valorTotalDasVendas = valorTotalDasVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    

    @Override
    public double calcularSalario() {
        
        double calcComissao = getPercentualComissao() * getValorTotalDasVendas();
        
        return getSalarioBase() + calcComissao;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println(".......... EMPREGADO COMISSIONADO ...........");

        System.out.println("Nome: "+getNome());
        System.out.println("Total de vendas realizadas: "+getValorTotalDasVendas());
        System.out.println("Valor da porcentagem de comissao: "+getPercentualComissao());
        System.out.println("Salario: "+calcularSalario());
    
    }
    
    
}
