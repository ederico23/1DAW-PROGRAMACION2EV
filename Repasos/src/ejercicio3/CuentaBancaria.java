package ejercicio3;

public class CuentaBancaria {
	public String titular;
	public double saldo;
	
	/**
	 * @param titular
	 * @param saldo
	 */
	public CuentaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public void retirar(double cantidad) throws SaldoInsuficienteException{
		if (cantidad > saldo) {
			throw new SaldoInsuficienteException();
		}
		
		this.saldo -= cantidad;
	}
}
