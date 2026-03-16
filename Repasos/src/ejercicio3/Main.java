package ejercicio3;

import java.util.ArrayList;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {
		ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();
		
		CuentaBancaria c1 = new CuentaBancaria("eder", 2000);
		
		listaCuentas.add(c1);
		
		System.out.println("bienvenido " + c1.titular 
				+ " tienes de saldo " + c1.saldo + "€");
		//retirar el dinero
		do {
			
		double retiro = Leer.leerDouble("cuanto dinero quieres retirar?");
		
		try {
			
			c1.retirar(retiro);
			//solo si se consigue retirar
			System.out.println("retiro exitoso");
			System.out.println("has sacado " + retiro + "€");
			System.out.println("te quedan " + c1.saldo + "€");
			
		} catch (SaldoInsuficienteException e) {
			System.out.println("error: " + e.getMessage());
			System.out.println("tu saldo es de " + c1.saldo + "€");
		}
		
		} while (c1.saldo>0);
		
		System.out.println("la cuenta está en 0");
	}

}
