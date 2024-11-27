
package com.mycompany.trabalho_poo_2_bimestre.MGZoo;

/**
 *
 * @author Tassy
 */
public class TesteZooDois {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bethoven", 5, 60, 60);
        Papagaio papagaio = new Papagaio ("Loro José)", 3, 80, 5);
        Cobra cobra = new Cobra("Vibora do kung fuu panda", 1, 0.90, 10);
        
        Animal [] animais = new Animal[3];
        animais[0] = cachorro;
        animais[1] = papagaio;
        animais [2] = cobra;
        
        for (Animal animal : animais){
            
            if(animal instanceof Cachorro){
                Cachorro c = (Cachorro) animal;
                animal.fazerSom();
                animal.exibirInformacoes();
                c.correr();
                System.out.println("-----------------");

            }else if (animal instanceof Papagaio){
                Papagaio p = (Papagaio) animal;
                animal.fazerSom();
                animal.exibirInformacoes();
                p.voar();
                System.out.println("-----------------");
            }else if (animal instanceof Cobra){
                Cobra cob = (Cobra) animal;
                animal.fazerSom();
                animal.exibirInformacoes();
                cob.rastejar();
                System.out.println("-----------------");
            }

        }
    }
}
