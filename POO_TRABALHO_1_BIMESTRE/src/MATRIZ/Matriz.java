package MATRIZ;

import java.util.Random;

public class Matriz {
	
	private int nLinhas;
	private int nColunas;
	private int limite;
	private int[][] matriz;
	
    public Matriz(int linhas, int colunas, int limite) {
    	setnLinhas(linhas);
    	setnColunas(colunas);
		setLimite(limite);
		matriz = new int [getnLinhas()][getnColunas()];

	}
    
    
	public int getnLinhas() {
		return nLinhas;
	}

	public void setnLinhas(int nLinhas) {
		if(nLinhas >= 0) {
		this.nLinhas = nLinhas;
		}else {
			System.exit(nLinhas);
		}
	}

	public int getnColunas() {
		return nColunas;
	}

	public void setnColunas(int nColunas) {
	   if(nColunas >= 0) {
		  this.nColunas = nColunas;
		}else {
		   System.exit(limite);
		}
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		if(limite >= 0) {
		   this.limite = limite;
		}else {
			System.exit(limite);
		}
		
	}

	public void preencher() {
		Random r = new Random();
				
		for (int i = 0; i < getnLinhas(); i++) {
			for(int j = 0; j < getnColunas(); j++) {
				matriz[i][j] = r.nextInt(getLimite());
				System.out.print(" "+matriz[i][j]);

			}System.out.println(" ");

		}
		
	}
	
	public void substituirPares (int valor) {
		for (int i = 0; i < getnLinhas(); i++) {
			for(int j = 0; j < getnColunas(); j++) {
				if(matriz[i][j]%2==0) {
					matriz[i][j] = valor;
				}
				

			}

		}
		
	}
	
	public void imprimirInfor() {		
		for (int i = 0; i < getnLinhas(); i++) {
			for(int j = 0; j < getnColunas(); j++) {
				System.out.print(" "+matriz[i][j]);
			}
			System.out.println("");

		}
	}
	
}
