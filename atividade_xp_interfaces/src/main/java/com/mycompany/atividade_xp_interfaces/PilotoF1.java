
package com.mycompany.atividade_xp_interfaces;

import java.util.Random;

/**
 *
 * @author Tassy
 */
public class PilotoF1 implements AcoesCorridaF1, AcoesPilotoF1{
    
    private String nome;
    private String time;
    private float tempoSprint;

    public PilotoF1(String nome, String time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getTempoSprint() {
        return tempoSprint;
    }

    public void setTempoSprint(float tempoSprint) {
        this.tempoSprint = tempoSprint;
    }
    
    

    @Override
    public float qualificarPole() {
        //System.out.println(getNome() + " tempo da Sprint: " + this.tempoSprint + " segundos");
        return this.tempoSprint = 60 + new Random().nextFloat() * 60;
    }
    
    @Override
    public float relatarTempoDeVolta() {
        float tvolta = 60 + new Random().nextFloat() * 60;
        return tvolta;
    }

    @Override
    public PilotoF1 definirPolePosition(PilotoF1 [] pilotos) {
        PilotoF1 polePosition = pilotos [0];
        
       for (int i = 0; i< pilotos.length; i++ ){
            pilotos[i].qualificarPole();
       }
        
       for (int i = 0; i< pilotos.length; i++ ){
           if (pilotos[i].getTempoSprint() < pilotos[i].getTempoSprint()) {
              polePosition = pilotos [i];
           } 
           
            System.out.println("\nPole Position: " + pilotos[i].getNome() + " com o tempo de Sprint: " + polePosition.getTempoSprint() + " segundos");

       }
        return polePosition;
    }

    @Override
    public void receberInstrucao(String instrucao) {
        System.out.println(instrucao);
    }

    @Override
    public void acelerar() {
        System.out.println(getNome() +" acelerou!!!!");    
    }

    @Override
    public void frear() {
        System.out.println(getNome() +" freiou");    
    }

    @Override
    public void ultrapassar() {
        System.out.println(getNome() +" fez uma ultrapassagem!!!!");    
    }

    @Override
    public boolean acionaRDS() {
        Random random = new Random();
        boolean rds = random.nextBoolean();
        
        if(rds){
          System.out.println(getNome() +" acionou o RDS!!!!"); 
            return rds;
        }else{
            return rds == false;
        }
            }

    @Override
    public void fazerCurva() {
        System.out.println(getNome() +" faz a curva");
    }

    
    
}
