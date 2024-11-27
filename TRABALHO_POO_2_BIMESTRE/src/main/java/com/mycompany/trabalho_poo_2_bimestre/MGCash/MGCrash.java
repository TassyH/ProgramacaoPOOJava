package com.mycompany.trabalho_poo_2_bimestre.MGCash;

/**
 *
 * @author Tassy
 */
public class MGCrash {
    public static void main(String[] args) {
        
        EmpregadoAssalariado clt_1 = new EmpregadoAssalariado("Joao da Silva", 2000);
        EmpregadoAssalariado clt_2 = new EmpregadoAssalariado("Maria Joaquina", 1900);
        
        EmpregadoComissionado vendedor_1 = new EmpregadoComissionado("Luiz Souzsa", 2000, 800.88, 0.30);
        EmpregadoComissionado vendedor_2 = new EmpregadoComissionado("Albert da Costa", 2000, 798.88, 0.40);
        
        EmpregadoHorista pj_1 = new EmpregadoHorista("Louis Point Du Lac", 1700, 25, 170);
        EmpregadoHorista pj_2 = new EmpregadoHorista("Lestat Delacourt", 1800, 30, 170);
        
        Empregado [] empregados = new Empregado[6];
        empregados[0] = clt_1;
        empregados[1] = clt_2;
        empregados[2] = vendedor_1;
        empregados[3] = vendedor_2;
        empregados [4] = pj_1;
        empregados [5] = pj_2;
        
        for(int i = 0; i < empregados.length; i++){
            empregados[i].exibirDetalhes();
        }
        double salarioTotal = 0;
        System.out.println("---------- RELATÓRIO GERAL  DOS FUNCIONARIOS: -----------");

        for(int i =0; i<empregados.length; i++){
            String nome = empregados[i].getNome();            
            
            if(empregados[i] instanceof EmpregadoAssalariado){
                System.out.println(nome);
                System.out.print("TIPO ==>  Assalariado");
                System.out.println("");
                EmpregadoAssalariado as = (EmpregadoAssalariado) empregados[i];
                System.out.println("Salario do assalariado = "+as.calcularSalario());
                salarioTotal = salarioTotal + as.calcularSalario();
                System.out.println("----------------------");

            }else if(empregados[i] instanceof EmpregadoComissionado){
                System.out.println(nome);
                System.out.print("TIPO ==>  Comissionado");
                System.out.println("");
                EmpregadoComissionado as = (EmpregadoComissionado) empregados[i];
                System.out.println("Salario do Comissionado = "+as.calcularSalario());
                salarioTotal = salarioTotal + as.calcularSalario();
                System.out.println("----------------------");

            }else if (empregados[i] instanceof EmpregadoHorista){
                System.out.print(nome);
                System.out.println("TIPO ==>  Horista");
                EmpregadoHorista as = (EmpregadoHorista) empregados[i];
                System.out.println("Salario do Horista = "+as.calcularSalario());
                salarioTotal = salarioTotal + as.calcularSalario();
                System.out.println("----------------------");
            }
        }
        System.out.println("");
        System.out.println("________________________________");

                                    
         System.out.println("SALARIO TOTAL ===>>>>" + salarioTotal);

    }
    
}
