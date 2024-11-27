/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_xp_interfaces;

import java.util.ArrayList;
import java.util.List;
import org.ietf.jgss.Oid;

/**
 *
 * @author Tassy
 */
public class RealizarCorridaF1GranPrix {
    
    public static void main(String[] args) {
      PilotoF1 gorge = new PilotoF1("George Russel", "Mercedes");
      PilotoF1 max = new PilotoF1("Max Verstappen", "Red Bull");
      PilotoF1 lw = new PilotoF1("Lewis Hamiltom", "Mercedes");

      PilotoF1 [] pF1 = new PilotoF1[3];
      
      
      pF1 [0] = lw;
      pF1 [1] = gorge;
      pF1 [2] = max;
      
      for(int i = 0; i < pF1.length; i++){
         pF1[i].qualificarPole();
      }
      
      List <PilotoF1> polesPositions = new ArrayList <>();
      
      for (PilotoF1 piloto : pF1) {
            polesPositions.add(piloto.definirPolePosition(pF1));
        } 
      
        System.out.println("");
        System.out.println("Começando a corrida...1 ...2 ...3 ... GOOOOO");

      
            pF1[0].acelerar();
            pF1[0].receberInstrucao("acelera com tudo mermao sem medo de ser feliz");
            pF1[0].frear();
            pF1[0].fazerCurva();
            pF1[0].acelerar();
           double tempoVoltas =  pF1[0].relatarTempoDeVolta();
            pF1[0].acionaRDS();
           System.out.println("TEMPO DE VOLTA: "+tempoVoltas);
           if(tempoVoltas <= 70.0){
             pF1[0].ultrapassar();
             pF1[0].acelerar();

           }
       }

      
    }
      
      


   
