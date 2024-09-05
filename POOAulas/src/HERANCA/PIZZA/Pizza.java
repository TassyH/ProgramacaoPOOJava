package HERANCA.PIZZA;

public class Pizza {
	
	private String ingredientes;
	private int tempoDeForno;
	private double preco; 
	
	public Pizza(String inString, int tempoDeForno, double preco) {
		this.ingredientes = inString;
		this.tempoDeForno = tempoDeForno;
		this.preco = preco;
	}
	
	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTempoDeForno() {
		return tempoDeForno;
	}

	public void setTempoDeForno(int tempoDeForno) {
		this.tempoDeForno = tempoDeForno;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	
	public void detalharPizza(){
		System.out.println("Ingredientes: "+ingredientes);
		System.out.println("tempo de forno: "+tempoDeForno);
		System.out.println("Preço: "+preco);
		
	}

}
