package BANK;

public class ContaBancaria {
	private int agencia;
	private int conta;
	private String nomeCorrentista;
	private String cpfCorrentista;
	private double saldo;
	
	
	public ContaBancaria(int agencia, int conta, String nomeCorrentista, String cpfCorrentista, double saldo) {
		setAgencia(agencia);
		setConta(conta);
		setNomeCorrentista(nomeCorrentista);
		if(cpfCorrentista.toCharArray().length <= 11) {
			System.out.println("cpf valido");
		    setCpfCorrentista(cpfCorrentista);
		}else {
			System.out.println("cpf invalido");
			cpfCorrentista = "CPF Invalido!";
			System.exit(conta);

		}
		if(saldo < 0) {
			System.out.println("saldo negativo = vira 0 na hora baby");
			saldo = 0;
		    setSaldo(saldo);
		}else {
		    setSaldo(saldo);

		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	public String getCpfCorrentista() {
		return cpfCorrentista;
	}
	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public boolean validaCpf(String cpfCorrentista) {
		if(cpfCorrentista.toCharArray().length > 11) {
			setCpfCorrentista(cpfCorrentista);
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		double dep;
		dep = getSaldo() + valor;
		setSaldo(dep);
	}
	
	public void sacar (double valor) {
		double sacar;
		sacar = getSaldo() - valor;
		setSaldo(sacar);
	}
	
	public void imprimirInfor() {
		System.out.println("CPF: "+getCpfCorrentista());
		System.out.println("NOME: "+getNomeCorrentista());
		System.out.println("CONTA: "+getConta());
		System.out.println("AGENCIA: "+getAgencia());
		System.out.println("SALDO: "+getSaldo());

	}
}
