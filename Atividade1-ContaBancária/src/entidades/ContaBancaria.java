package entidades;

public class ContaBancaria {
	
	private String numero;
	private double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(String numero, double saldoInicial) {
		this.numero = numero;
		this.saldo = saldoInicial;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void debitar(double valor) {

		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
