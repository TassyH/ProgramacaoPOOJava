package CONTROLE_REMOTO;

public class ControleRemoto {
    private String marca;
    private int canalAtual;
    private int potenciaVolume;

    public ControleRemoto(String marca, int canalAtual, int potenciaVolume) {
        this.marca = marca;
        this.canalAtual = canalAtual;
        this.potenciaVolume = potenciaVolume;
    }

    public void aumentarVolume() {
        if (potenciaVolume < 100) {
            potenciaVolume++;
        } else {
            System.out.println("Volume > 100.");
        }
    }

 
    public void diminuirVolume() {
        if (potenciaVolume > 0) {
            potenciaVolume--;
        } else {
            System.out.println("Volume < 0");
        }
    }

    public void trocarCanal(int canal01) {
        if (canal01 >= 1 && canal01 <= 15) {
            canalAtual = canal01;
        } else {
            System.out.println("Canal inválidoi!");
        }
    }

    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Canal Atual: " + canalAtual);
        System.out.println("Volume Atual: " + potenciaVolume);
    }
}
